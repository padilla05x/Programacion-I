package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.VehiculoController;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VehiculoViewController {

    private VehiculoController vehiculoController;
    private ObservableList<Vehiculo> listVehiculo = FXCollections.observableArrayList();
    private Vehiculo selectedVehiculo;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtMarca;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableView<Vehiculo> tblListVehiculo;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnActualizarVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TableColumn<Vehiculo, String> tbcModelo;

    @FXML
    private Button btbAgregarVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbcMatricula;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TableColumn<Vehiculo, String> tbcTipo;

    @FXML
    private ComboBox<String> cmbTipo; // ComboBox para seleccionar el tipo de vehículo

    @FXML
    void onAgregarVehiculo() {
        agregarVehiculo();
    }

    @FXML
    void onActualizarVehiculo() {
        actualizarVehiculo();
    }

    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminar() {
        eliminarVehiculo();
    }

    @FXML
    void initialize() {
        vehiculoController = new VehiculoController(App.empresa);
        cmbTipo.setItems(FXCollections.observableArrayList("Auto", "Camioneta", "Moto"));
        initView();
    }

    private void initView() {
        // Configurar las columnas de la tabla
        initDataBinding();

        // Cargar y mostrar la lista de vehículos
        obtenerVehiculos();

        // Limpiar la tabla inicialmente
        tblListVehiculo.getItems().clear();

        // Agregar los elementos a la tabla
        tblListVehiculo.setItems(listVehiculo);

        // Configurar el listener para seleccionar un vehículo en la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcMatricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcTipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipo())); // Nuevo binding para tipo
    }

    private void obtenerVehiculos() {
        listVehiculo.addAll(vehiculoController.obtenerListaVehiculos());
    }

    private void listenerSelection() {
        tblListVehiculo.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
            mostrarInformacionVehiculo(selectedVehiculo);
        });
    }

    private void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            txtMatricula.setText(vehiculo.getMatricula());
            txtMarca.setText(vehiculo.getMarca());
            txtModelo.setText(vehiculo.getModelo());
            cmbTipo.setValue(vehiculo.getTipo());
        }
    }

    private void agregarVehiculo() {
        Vehiculo vehiculo = buildVehiculo();
        if (vehiculoController.crearVehiculo(vehiculo)) {
            listVehiculo.add(vehiculo);
            limpiarCamposVehiculo();
        }
    }

    private Vehiculo buildVehiculo() {
        return new Vehiculo(
            txtMatricula.getText(),
            txtMarca.getText(),
            txtModelo.getText(),
            cmbTipo.getValue()
        );
    }

    private void eliminarVehiculo() {
        if (vehiculoController.eliminarVehiculo(txtMatricula.getText())) {
            listVehiculo.remove(selectedVehiculo);
            limpiarCamposVehiculo();
            limpiarSeleccion();
        }
    }

    private void actualizarVehiculo() {
        if (selectedVehiculo != null &&
            vehiculoController.actualizarVehiculo(selectedVehiculo.getMatricula(), buildVehiculo())) {

            int index = listVehiculo.indexOf(selectedVehiculo);
            if (index >= 0) {
                listVehiculo.set(index, buildVehiculo());
            }

            tblListVehiculo.refresh();
            limpiarSeleccion();
            limpiarCamposVehiculo();
        }
    }

    private void limpiarSeleccion() {
        tblListVehiculo.getSelectionModel().clearSelection();
        limpiarCamposVehiculo();
    }

    private void limpiarCamposVehiculo() {
        txtMatricula.clear();
        txtMarca.clear();
        txtModelo.clear();
        cmbTipo.getSelectionModel().clearSelection();
    }


    

    public void setApp(App app) {
        // Método para establecer la referencia de la aplicación si es necesario
    }
}
