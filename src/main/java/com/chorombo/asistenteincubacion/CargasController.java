/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.chorombo.asistenteincubacion;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.BiConsumer;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import models.Carga;

/**
 * FXML Controller class
 *
 * @author Poul
 */
public class CargasController implements Initializable {

    @FXML
    private Button btnLimpiar;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txt162;
    @FXML
    private TextField txt165;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt3;
    @FXML
    private TextField txt28;
    @FXML
    private TextField txt29;
    @FXML
    private TextField txt30;
    @FXML
    private TextField txt4;
    @FXML
    private TextField txt5;
    @FXML
    private TextField txt6;
    @FXML
    private TextField txt31;
    @FXML
    private TextField txt32;
    @FXML
    private TextField txt33;
    @FXML
    private TextField txt7;
    @FXML
    private TextField txt8;
    @FXML
    private TextField txt9;
    @FXML
    private TextField txt34;
    @FXML
    private TextField txt35;
    @FXML
    private TextField txt36;
    @FXML
    private TextField txt10;
    @FXML
    private TextField txt11;
    @FXML
    private TextField txt12;
    @FXML
    private TextField txt37;
    @FXML
    private TextField txt38;
    @FXML
    private TextField txt39;
    @FXML
    private TextField txt13;
    @FXML
    private TextField txt14;
    @FXML
    private TextField txt15;
    @FXML
    private TextField txt40;
    @FXML
    private TextField txt41;
    @FXML
    private TextField txt42;
    @FXML
    private TextField txt16;
    @FXML
    private TextField txt17;
    @FXML
    private TextField txt18;
    @FXML
    private TextField txt43;
    @FXML
    private TextField txt44;
    @FXML
    private TextField txt45;
    @FXML
    private TextField txt19;
    @FXML
    private TextField txt20;
    @FXML
    private TextField txt21;
    @FXML
    private TextField txt46;
    @FXML
    private TextField txt47;
    @FXML
    private TextField txt48;
    @FXML
    private TextField txt22;
    @FXML
    private TextField txt23;
    @FXML
    private TextField txt24;
    @FXML
    private TextField txt49;
    @FXML
    private TextField txt50;
    @FXML
    private TextField txt51;
    @FXML
    private TextField txt25;
    @FXML
    private TextField txt26;
    @FXML
    private TextField txt27;
    @FXML
    private TextField txt52;
    @FXML
    private TextField txt53;
    @FXML
    private TextField txt54;
    @FXML
    private TextField o1;
    @FXML
    private TextField o2;
    @FXML
    private TextField o19;
    @FXML
    private TextField o20;
    @FXML
    private TextField o21;
    @FXML
    private TextField o3;
    @FXML
    private TextField o4;
    @FXML
    private TextField o22;
    @FXML
    private TextField o23;
    @FXML
    private TextField o24;
    @FXML
    private TextField o5;
    @FXML
    private TextField o6;
    @FXML
    private TextField o25;
    @FXML
    private TextField o26;
    @FXML
    private TextField o27;
    @FXML
    private TextField o7;
    @FXML
    private TextField o8;
    @FXML
    private TextField o28;
    @FXML
    private TextField o29;
    @FXML
    private TextField o30;
    @FXML
    private TextField o9;
    @FXML
    private TextField o10;
    @FXML
    private TextField o31;
    @FXML
    private TextField o32;
    @FXML
    private TextField o33;
    @FXML
    private TextField o11;
    @FXML
    private TextField o12;
    @FXML
    private TextField o34;
    @FXML
    private TextField o35;
    @FXML
    private TextField o36;
    @FXML
    private TextField o13;
    @FXML
    private TextField o14;
    @FXML
    private TextField o37;
    @FXML
    private TextField o38;
    @FXML
    private TextField o39;
    @FXML
    private TextField o40;
    @FXML
    private TextField o15;
    @FXML
    private TextField o16;
    @FXML
    private TextField o41;
    @FXML
    private TextField o42;
    @FXML
    private TextField o17;
    @FXML
    private TextField o18;
    @FXML
    private TextField o43;
    @FXML
    private TextField o44;
    @FXML
    private TextField o45;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl6;
    @FXML
    private Label lbl7;
    @FXML
    private Label lbl8;
    @FXML
    private Label lbl9;
    @FXML
    private Circle light1;
    @FXML
    private Circle light2;
    @FXML
    private Circle light3;
    @FXML
    private Circle light4;
    @FXML
    private Circle light5;
    @FXML
    private Circle light6;
    @FXML
    private Circle light7;
    @FXML
    private Circle light8;
    @FXML
    private Circle light9;

    private Carga carga1;
    private Carga carga2;
    private Carga carga3;
    private Carga carga4;
    private Carga carga5;
    private Carga carga6;
    private Carga carga7;
    private Carga carga8;
    private Carga carga9;

    private Map<String, Carga> cargas;
    private Map<String, BiConsumer<Carga, Integer>> setters;

    private List<Carga> allCargas;
    private List<TextField> saldos;
    private List<Label> labels;
    private List<Circle> lights;

    private IntegerProperty totalDisplaySaldo = new SimpleIntegerProperty();

    /**
     * Este método inicializa varios aspectos de la aplicación.
     *
     * @param url Define la ubicación de la raíz del objeto que se inicializa.
     * Este parámetro es comúnmente utilizado en la creación de una GUI mediante
     * FXML.
     * @param rb Es un recurso usado para localizar objetos raíz, este parámetro
     * es comúnmente utilizado en la creación de una GUI mediante FXML.
     *
     * <ul>
     * <li>Se crea un listado con todos los cuadros de texto (TextBox) a los que
     * se ingresarán datos. Estos TextBox solo aceptarán números.</li>
     * <li>Se crean varios objetos de carga para almacenar y gestionar la
     * información correspondiente a cada uno.</li>
     * <li>Se asocian los TextBox con los objetos de carga correspondientes.
     * Cada TextBox tiene un método setter correspondiente que se utiliza para
     * almacenar el valor del TextBox en el objeto de carga.</li>
     * <li>Se unen varias propiedades de los objetos de carga a los elementos de
     * la GUI para que se actualicen automáticamente cuando cambien las
     * propiedades de los objetos de carga.</li>
     * <li>Se configura un listener en cada objeto de carga para calcular y
     * mostrar el saldo total cada vez que se modifica una de las propiedades de
     * saldo de los objetos de carga.</li>
     * <li>Se configura un listener en el saldo total para calcular y mostrar
     * dos valores diferentes basados en el saldo total cada vez que se
     * modifica.</li>
     * </ul>
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Creamos un listado con todos lo textBox a los que ingresar datos
        List<TextField> inputText = Arrays.asList(txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10,
                txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20,
                txt21, txt22, txt23, txt24, txt25, txt26, txt27, txt28, txt29, txt30,
                txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40,
                txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48, txt49, txt50,
                txt51, txt52, txt53, txt54);

        totalDisplaySaldo.set(0);

        //La aplicamos la regla para que solo acepte números
        for (TextField textField : inputText) {
            numericOnly(textField);
        }

        //Creamos un objeto de carga por cada elemento exitente.
        this.carga1 = new Carga();
        this.carga2 = new Carga();
        this.carga3 = new Carga();
        this.carga4 = new Carga();
        this.carga5 = new Carga();
        this.carga6 = new Carga();
        this.carga7 = new Carga();
        this.carga8 = new Carga();
        this.carga9 = new Carga();

        allCargas = Arrays.asList(carga1, carga2, carga3, carga4, carga5, carga6, carga7, carga8, carga9);
        saldos = Arrays.asList(txt2, txt5, txt8, txt11, txt14, txt17, txt20, txt23, txt26);
        lights = Arrays.asList(light1, light2, light3, light4, light5, light6, light7, light8, light9);
        labels = Arrays.asList(lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9);

        cargas = Map.ofEntries(
                Map.entry("txt1", carga1),
                Map.entry("txt2", carga1),
                Map.entry("txt3", carga1),
                Map.entry("txt28", carga1),
                Map.entry("txt29", carga1),
                Map.entry("txt30", carga1),
                Map.entry("txt4", carga2),
                Map.entry("txt5", carga2),
                Map.entry("txt6", carga2),
                Map.entry("txt31", carga2),
                Map.entry("txt32", carga2),
                Map.entry("txt33", carga2),
                Map.entry("txt7", carga3),
                Map.entry("txt8", carga3),
                Map.entry("txt9", carga3),
                Map.entry("txt34", carga3),
                Map.entry("txt35", carga3),
                Map.entry("txt36", carga3),
                Map.entry("txt10", carga4),
                Map.entry("txt11", carga4),
                Map.entry("txt12", carga4),
                Map.entry("txt37", carga4),
                Map.entry("txt38", carga4),
                Map.entry("txt39", carga4),
                Map.entry("txt13", carga5),
                Map.entry("txt14", carga5),
                Map.entry("txt15", carga5),
                Map.entry("txt40", carga5),
                Map.entry("txt41", carga5),
                Map.entry("txt42", carga5),
                Map.entry("txt16", carga6),
                Map.entry("txt17", carga6),
                Map.entry("txt18", carga6),
                Map.entry("txt43", carga6),
                Map.entry("txt44", carga6),
                Map.entry("txt45", carga6),
                Map.entry("txt19", carga7),
                Map.entry("txt20", carga7),
                Map.entry("txt21", carga7),
                Map.entry("txt46", carga7),
                Map.entry("txt47", carga7),
                Map.entry("txt48", carga7),
                Map.entry("txt22", carga8),
                Map.entry("txt23", carga8),
                Map.entry("txt24", carga8),
                Map.entry("txt49", carga8),
                Map.entry("txt50", carga8),
                Map.entry("txt51", carga8),
                Map.entry("txt25", carga9),
                Map.entry("txt26", carga9),
                Map.entry("txt27", carga9),
                Map.entry("txt52", carga9),
                Map.entry("txt53", carga9),
                Map.entry("txt54", carga9)
        );

        setters = Map.ofEntries(
                Map.entry("txt1", Carga::setPreSaldo),
                Map.entry("txt2", Carga::setSaldo),
                Map.entry("txt3", Carga::setPostSaldo),
                Map.entry("txt28", Carga::setInutilizado),
                Map.entry("txt29", Carga::setVenta),
                Map.entry("txt30", Carga::setTrizado),
                Map.entry("txt4", Carga::setPreSaldo),
                Map.entry("txt5", Carga::setSaldo),
                Map.entry("txt6", Carga::setPostSaldo),
                Map.entry("txt31", Carga::setInutilizado),
                Map.entry("txt32", Carga::setVenta),
                Map.entry("txt33", Carga::setTrizado),
                Map.entry("txt7", Carga::setPreSaldo),
                Map.entry("txt8", Carga::setSaldo),
                Map.entry("txt9", Carga::setPostSaldo),
                Map.entry("txt34", Carga::setInutilizado),
                Map.entry("txt35", Carga::setVenta),
                Map.entry("txt36", Carga::setTrizado),
                Map.entry("txt10", Carga::setPreSaldo),
                Map.entry("txt11", Carga::setSaldo),
                Map.entry("txt12", Carga::setPostSaldo),
                Map.entry("txt37", Carga::setInutilizado),
                Map.entry("txt38", Carga::setVenta),
                Map.entry("txt39", Carga::setTrizado),
                Map.entry("txt13", Carga::setPreSaldo),
                Map.entry("txt14", Carga::setSaldo),
                Map.entry("txt15", Carga::setPostSaldo),
                Map.entry("txt40", Carga::setInutilizado),
                Map.entry("txt41", Carga::setVenta),
                Map.entry("txt42", Carga::setTrizado),
                Map.entry("txt16", Carga::setPreSaldo),
                Map.entry("txt17", Carga::setSaldo),
                Map.entry("txt18", Carga::setPostSaldo),
                Map.entry("txt43", Carga::setInutilizado),
                Map.entry("txt44", Carga::setVenta),
                Map.entry("txt45", Carga::setTrizado),
                Map.entry("txt19", Carga::setPreSaldo),
                Map.entry("txt20", Carga::setSaldo),
                Map.entry("txt21", Carga::setPostSaldo),
                Map.entry("txt46", Carga::setInutilizado),
                Map.entry("txt47", Carga::setVenta),
                Map.entry("txt48", Carga::setTrizado),
                Map.entry("txt22", Carga::setPreSaldo),
                Map.entry("txt23", Carga::setSaldo),
                Map.entry("txt24", Carga::setPostSaldo),
                Map.entry("txt49", Carga::setInutilizado),
                Map.entry("txt50", Carga::setVenta),
                Map.entry("txt51", Carga::setTrizado),
                Map.entry("txt25", Carga::setPreSaldo),
                Map.entry("txt26", Carga::setSaldo),
                Map.entry("txt27", Carga::setPostSaldo),
                Map.entry("txt52", Carga::setInutilizado),
                Map.entry("txt53", Carga::setVenta),
                Map.entry("txt54", Carga::setTrizado)
        );

        //Binding      
        o1.textProperty().bind(carga1.displaySaldoProperty());
        o2.textProperty().bind(carga1.saldoProperty().asString());
        o19.textProperty().bind(carga1.inutilizadoProperty().asString());
        o20.textProperty().bind(carga1.ventaProperty().asString());
        o21.textProperty().bind(carga1.trizadoProperty().asString());

        o3.textProperty().bind(carga2.displaySaldoProperty());
        o4.textProperty().bind(carga2.saldoProperty().asString());
        o22.textProperty().bind(carga2.inutilizadoProperty().asString());
        o23.textProperty().bind(carga2.ventaProperty().asString());
        o24.textProperty().bind(carga2.trizadoProperty().asString());

        o5.textProperty().bind(carga3.displaySaldoProperty());
        o6.textProperty().bind(carga3.saldoProperty().asString());
        o25.textProperty().bind(carga3.inutilizadoProperty().asString());
        o26.textProperty().bind(carga3.ventaProperty().asString());
        o27.textProperty().bind(carga3.trizadoProperty().asString());

        o7.textProperty().bind(carga4.displaySaldoProperty());
        o8.textProperty().bind(carga4.saldoProperty().asString());
        o28.textProperty().bind(carga4.inutilizadoProperty().asString());
        o29.textProperty().bind(carga4.ventaProperty().asString());
        o30.textProperty().bind(carga4.trizadoProperty().asString());

        o9.textProperty().bind(carga5.displaySaldoProperty());
        o10.textProperty().bind(carga5.saldoProperty().asString());
        o31.textProperty().bind(carga5.inutilizadoProperty().asString());
        o32.textProperty().bind(carga5.ventaProperty().asString());
        o33.textProperty().bind(carga5.trizadoProperty().asString());

        o11.textProperty().bind(carga6.displaySaldoProperty());
        o12.textProperty().bind(carga6.saldoProperty().asString());
        o34.textProperty().bind(carga6.inutilizadoProperty().asString());
        o35.textProperty().bind(carga6.ventaProperty().asString());
        o36.textProperty().bind(carga6.trizadoProperty().asString());

        o13.textProperty().bind(carga7.displaySaldoProperty());
        o14.textProperty().bind(carga7.saldoProperty().asString());
        o37.textProperty().bind(carga7.inutilizadoProperty().asString());
        o38.textProperty().bind(carga7.ventaProperty().asString());
        o39.textProperty().bind(carga7.trizadoProperty().asString());

        o15.textProperty().bind(carga8.displaySaldoProperty());
        o16.textProperty().bind(carga8.saldoProperty().asString());
        o40.textProperty().bind(carga8.inutilizadoProperty().asString());
        o41.textProperty().bind(carga8.ventaProperty().asString());
        o42.textProperty().bind(carga8.trizadoProperty().asString());

        o17.textProperty().bind(carga9.displaySaldoProperty());
        o18.textProperty().bind(carga9.saldoProperty().asString());
        o43.textProperty().bind(carga9.inutilizadoProperty().asString());
        o44.textProperty().bind(carga9.ventaProperty().asString());
        o45.textProperty().bind(carga9.trizadoProperty().asString());

        //Binding del total
        for (Carga carga : allCargas) {
            carga.displaySaldoProperty().addListener((observable, oldValue, newValue) -> {
                totalDisplaySaldo.set(calculateTotalDisplaySaldo());
            });
        }

        txtTotal.textProperty().bind(totalDisplaySaldo.asString());

        txtTotal.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                int total = Integer.parseInt(newValue);

                txt162.setText(String.format("%.2f",total / 162.0));
                txt165.setText(String.format("%.2f",total / 165.0));
            } catch (NumberFormatException e) {

            }
        });

        for (int i = 0; i < allCargas.size(); i++) {
            Carga carga = allCargas.get(i);
            Label label = labels.get(i);

            label.textProperty().bind(carga.differenceMessageProperty());
            // Define el color del texto según si la diferencia es negativa o positiva
            carga.differenceMessageProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue.isEmpty()) {
                    label.setTextFill(Color.RED);
                } else {
                    label.setTextFill(Color.BLACK);
                }
            });
        }

    }

    /**
     * Este método cierra la ventana actual y abre una nueva ventana con el menú principal.
     * Se carga el archivo FXML correspondiente al menú principal, se establece la escena y se muestra la nueva ventana.
     * Se cierra la ventana actual obteniendo la escena del botón 'btnLimpiar' y llamando al método 'close' en su 'Stage'.
     * En caso de que la carga del archivo FXML falle, se captura la excepción IOException y se imprime la traza de la pila.
     * @author Poul
     */
    public void closeWindows() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.getIcons().add(new Image("/assets/calculator.png"));
            stage.setTitle("Asistente de cargas");
            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnLimpiar.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Este método maneja el evento de click en el botón "Limpiar". 
     * Cierra la ventana actual y abre una nueva ventana con la interfaz "Cargas".
     * La nueva ventana es cargada a partir del archivo FXML correspondiente y se obtiene su controlador.
     * Luego se establece la escena y se muestra la nueva ventana.
     * También se define lo que debe hacer la aplicación cuando se cierra la nueva ventana,
     * que en este caso es llamar al método 'closeWindows' del controlador de "Cargas".
     * Finalmente, se cierra la ventana actual.
     * En caso de que la carga del archivo FXML falle, se captura la excepción IOException y se imprime la traza de la pila.
     * @author Poul
     */
    @FXML
    private void limpiar(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

        try {
            //Cargo la visa
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cargas.fxml"));

            //Cargo el padre
            Parent root = loader.load();

            //Obtengo el controlador
            CargasController controlador = loader.getController();

            //Creo la escena y el escenario
            Scene scene = new Scene(root);
            Stage newStage = new Stage();

            //Asocio el escenario con la escena
            newStage.getIcons().add(new Image("/assets/calculator.png"));
            newStage.setTitle("Asistente de cargas");
            newStage.setScene(scene);
            newStage.show();

            // Indico que debe hacer al cerrar
            newStage.setOnCloseRequest(e -> controlador.closeWindows());

            // Cierro la ventana donde estoy
            stage.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Este método privado restringe la entrada del usuario a solo valores numéricos en un campo de texto especificado.
     * Agrega un ChangeListener a la propiedad de texto del TextField.
     * Cada vez que se cambia el texto, se verifica el nuevo valor.
     * Si el nuevo valor no es un dígito (indicado por el patrón de la expresión regular "\\d*"), 
     * entonces se reemplazan todos los caracteres no numéricos en el nuevo valor con una cadena vacía, 
     * y se establece este valor puramente numérico como el nuevo texto del TextField.
     *
     * @param textField el campo de texto al que se va a agregar la restricción numérica.
     */
    private void numericOnly(TextField textField) {
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                    String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    /**
     * Este método de controlador, marcado con la anotación FXML, se usa para establecer la 'carga' en función de un evento KeyEvent.
     * Toma un KeyEvent como parámetro, y asume que la fuente del evento es un TextField.
     * Se obtiene el ID y el texto del TextField y se almacenan en variables locales.
     * Se usa un operador ternario para verificar si el texto está vacío; si lo está, se establece el valor en 0, 
     * de lo contrario, se convierte el texto en un número entero.
     * Luego, se recupera la 'Carga' correspondiente al ID del TextField de un mapa 'cargas' y se almacena en una variable local.
     * Finalmente, se usa un mapa 'setters' para recuperar un BiConsumer que acepta una 'Carga' y un valor entero, 
     * y se aplica este BiConsumer a la 'Carga' y al valor recuperados.
     *
     * @param event el evento de teclado que desencadena este método.
     */
    @FXML
    private void setCarga(KeyEvent event) {
        String id = ((TextField) event.getSource()).getId();
        String text = ((TextField) event.getSource()).getText();

        int value = text.isEmpty() ? 0 : Integer.parseInt(text);

        Carga carga = cargas.get(id);
        setters.get(id).accept(carga, value);

    }

    /**
     * Este método de controlador, marcado con la anotación FXML, se usa para verificar y manipular la lista de TextField 'saldos'
     * en respuesta a un evento KeyEvent. Asume que la fuente del evento es un TextField y recupera su ID.
     * Luego, itera sobre la lista 'saldos' para encontrar el TextField que coincide con el ID y lo almacena en una variable local.
     * Si se encuentra un TextField que coincide, se obtiene su índice en la lista 'saldos' y se llama al método setAsLastIfNoneFollow 
     * con ese índice.
     * Este método podría usarse para implementar una lógica que depende de la posición de un TextField en particular en la lista 'saldos',
     * por ejemplo, estableciendo ese TextField como el último en la lista si no sigue ningún otro.
     *
     * @param event el evento de teclado que desencadena este método.
     */
    @FXML
    private void checkFinal(KeyEvent event) {
        String id = ((TextField) event.getSource()).getId();

        TextField matchingTextField = null;

        // Encuentra el TextField con el id correspondiente.
        for (TextField field : saldos) {
            if (field.getId().equals(id)) {
                matchingTextField = field;
                break;
            }
        }

        // Obtén el índice del TextField correspondiente en la lista.
        if (matchingTextField != null) {
            int index = saldos.indexOf(matchingTextField);
            // Haz algo con el índice...
            setAsLastIfNoneFollow(index);
        }

    }

    /**
     * Este método se utiliza para manipular la colección de objetos 'Carga', indexados por su posición en 'allCargas'.
     * Dado un índice, verifica si ninguna de las Cargas que le siguen ha sido marcada como la última.
     * Si se encuentra una Carga que ya ha sido marcada como la última, se detiene el proceso.
     * 
     * Si la Carga en el índice especificado tiene un texto vacío y ha sido marcada como la última, 
     * entonces se revierte la "última" marca a la Carga anterior.
     * 
     * Si ninguna de las condiciones anteriores se cumple, la Carga en el índice especificado se marca como la última, y 
     * todas las Cargas anteriores se desmarcan como la última.
     * 
     * Además, este método controla la visibilidad de los objetos correspondientes en la lista 'lights', que están 
     * vinculados uno a uno con las Cargas en 'allCargas'.
     * 
     * @param index la posición de la Carga en la lista 'allCargas' a verificar y potencialmente marcar como la última.
     */
    private void setAsLastIfNoneFollow(int index) {

        // Primero, verificamos que ninguna de las Cargas que le siguen ya ha sido marcada como la última.
        for (int i = index + 1; i < allCargas.size(); i++) {
            if (allCargas.get(i).getIsLast()) {
                // Si encontramos una Carga que ya ha sido marcada como la última, salimos del método.
                return;
            }
        }

        // Comprobamos si la "última" Carga tiene texto vacío, y si es así, marcamos la Carga anterior como la última.
        if (index > 0 && allCargas.get(index).getIsLast() && saldos.get(index).getText().isEmpty()) {
            allCargas.get(index).setIsLast(false);
            lights.get(index).setVisible(false);

            allCargas.get(index - 1).setIsLast(true);
            lights.get(index - 1).setVisible(true);
        } // Si no, procedemos como antes.
        else {
            // Si llegamos aquí, ninguna de las Cargas que le siguen ha sido marcada como la última, por lo que podemos marcar esta Carga como la última.
            allCargas.get(index).setIsLast(true);
            lights.get(index).setVisible(true);

            // Ahora, desmarcamos todas las Cargas anteriores a esta como la última.
            for (int i = 0; i < index; i++) {
                allCargas.get(i).setIsLast(false);
                lights.get(i).setVisible(false);
            }
        }
    }

    /**
     * Este método calcula y devuelve el saldo total a mostrar de todas las cargas en la lista 'allCargas'.
     * Itera a través de cada objeto 'Carga' en 'allCargas', convierte el valor 'displaySaldo' de cada carga a un entero,
     * y luego suma estos valores a la variable total.
     * 
     * Es importante mencionar que si 'displaySaldo' no contiene un número válido en formato de cadena, 
     * 'Integer.parseInt()' lanzará una 'NumberFormatException'.
     *
     * @return total, que representa la suma de los saldos a mostrar de todas las cargas en 'allCargas'.
     */

    private int calculateTotalDisplaySaldo() {
        int total = 0;
        for (Carga carga : allCargas) {
            total += Integer.parseInt(carga.displaySaldoProperty().get());
        }
        return total;
    }

}
