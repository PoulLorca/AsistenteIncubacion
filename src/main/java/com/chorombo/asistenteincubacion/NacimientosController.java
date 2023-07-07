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
import java.util.stream.Stream;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableNumberValue;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import models.Nacimiento;

/**
 * FXML Controller class
 *
 * @author Poul
 */
public class NacimientosController implements Initializable {

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private TextField out1;
    @FXML
    private TextField txt3;
    @FXML
    private TextField out2;
    @FXML
    private TextField txt4;
    @FXML
    private TextField out3;
    @FXML
    private TextField out4;
    @FXML
    private TextField out5;
    @FXML
    private TextField out6;
    @FXML
    private TextField out7;
    @FXML
    private TextField txt5;
    @FXML
    private TextField txt6;
    @FXML
    private TextField out8;
    @FXML
    private TextField txt7;
    @FXML
    private TextField out9;
    @FXML
    private TextField txt8;
    @FXML
    private TextField out10;
    @FXML
    private TextField out11;
    @FXML
    private TextField out12;
    @FXML
    private TextField out13;
    @FXML
    private TextField out14;
    @FXML
    private TextField txt9;
    @FXML
    private TextField txt10;
    @FXML
    private TextField out15;
    @FXML
    private TextField txt11;
    @FXML
    private TextField out16;
    @FXML
    private TextField txt12;
    @FXML
    private TextField out17;
    @FXML
    private TextField out18;
    @FXML
    private TextField out19;
    @FXML
    private TextField out20;
    @FXML
    private TextField out21;
    @FXML
    private TextField txt13;
    @FXML
    private TextField txt14;
    @FXML
    private TextField out22;
    @FXML
    private TextField txt15;
    @FXML
    private TextField out23;
    @FXML
    private TextField txt16;
    @FXML
    private TextField out24;
    @FXML
    private TextField out25;
    @FXML
    private TextField out26;
    @FXML
    private TextField out27;
    @FXML
    private TextField out28;
    @FXML
    private TextField txt17;
    @FXML
    private TextField txt18;
    @FXML
    private TextField out29;
    @FXML
    private TextField txt19;
    @FXML
    private TextField out30;
    @FXML
    private TextField txt20;
    @FXML
    private TextField out31;
    @FXML
    private TextField out32;
    @FXML
    private TextField out33;
    @FXML
    private TextField out34;
    @FXML
    private TextField out35;
    @FXML
    private TextField txt21;
    @FXML
    private TextField txt22;
    @FXML
    private TextField out36;
    @FXML
    private TextField txt23;
    @FXML
    private TextField out37;
    @FXML
    private TextField txt24;
    @FXML
    private TextField out38;
    @FXML
    private TextField out39;
    @FXML
    private TextField out40;
    @FXML
    private TextField out41;
    @FXML
    private TextField out42;
    @FXML
    private TextField txt25;
    @FXML
    private TextField txt26;
    @FXML
    private TextField out43;
    @FXML
    private TextField txt27;
    @FXML
    private TextField out44;
    @FXML
    private TextField out45;
    @FXML
    private TextField txt28;
    @FXML
    private TextField out46;
    @FXML
    private TextField out47;
    @FXML
    private TextField out48;
    @FXML
    private TextField out49;
    @FXML
    private TextField txt29;
    @FXML
    private TextField txt30;
    @FXML
    private TextField out50;
    @FXML
    private TextField txt31;
    @FXML
    private TextField out51;
    @FXML
    private TextField txt32;
    @FXML
    private TextField out52;
    @FXML
    private TextField out53;
    @FXML
    private TextField out54;
    @FXML
    private TextField out55;
    @FXML
    private TextField out56;
    @FXML
    private TextField txt33;
    @FXML
    private TextField txt34;
    @FXML
    private TextField out57;
    @FXML
    private TextField txt35;
    @FXML
    private TextField out58;
    @FXML
    private TextField txt36;
    @FXML
    private TextField out59;
    @FXML
    private TextField out60;
    @FXML
    private TextField out61;
    @FXML
    private TextField out62;
    @FXML
    private TextField out63;
    @FXML
    private TextField txt37;
    @FXML
    private TextField txt38;
    @FXML
    private TextField out64;
    @FXML
    private TextField txt39;
    @FXML
    private TextField out65;
    @FXML
    private TextField txt40;
    @FXML
    private TextField out66;
    @FXML
    private TextField out67;
    @FXML
    private TextField out68;
    @FXML
    private TextField out69;
    @FXML
    private TextField out70;
    @FXML
    private TextField txt41;
    @FXML
    private TextField txt42;
    @FXML
    private TextField out71;
    @FXML
    private TextField txt43;
    @FXML
    private TextField out72;
    @FXML
    private TextField txt44;
    @FXML
    private TextField out73;
    @FXML
    private TextField out74;
    @FXML
    private TextField out75;
    @FXML
    private TextField out76;
    @FXML
    private TextField out77;
    @FXML
    private TextField txt45;
    @FXML
    private TextField txt46;
    @FXML
    private TextField out78;
    @FXML
    private TextField txt47;
    @FXML
    private TextField out79;
    @FXML
    private TextField txt48;
    @FXML
    private TextField out80;
    @FXML
    private TextField out81;
    @FXML
    private TextField out82;
    @FXML
    private TextField out83;
    @FXML
    private TextField out84;
    @FXML
    private TextField txt49;
    @FXML
    private TextField txt50;
    @FXML
    private TextField out85;
    @FXML
    private TextField txt51;
    @FXML
    private TextField out86;
    @FXML
    private TextField txt52;
    @FXML
    private TextField out87;
    @FXML
    private TextField out88;
    @FXML
    private TextField out89;
    @FXML
    private TextField out90;
    @FXML
    private TextField out91;
    @FXML
    private TextField txt53;
    @FXML
    private TextField txt54;
    @FXML
    private TextField out92;
    @FXML
    private TextField txt55;
    @FXML
    private TextField out93;
    @FXML
    private TextField txt56;
    @FXML
    private TextField out94;
    @FXML
    private TextField out95;
    @FXML
    private TextField out96;
    @FXML
    private TextField out97;
    @FXML
    private TextField out98;
    @FXML
    private TextField txt57;
    @FXML
    private TextField txt58;
    @FXML
    private TextField out99;
    @FXML
    private TextField txt59;
    @FXML
    private TextField out100;
    @FXML
    private TextField txt60;
    @FXML
    private TextField out101;
    @FXML
    private TextField out102;
    @FXML
    private TextField out103;
    @FXML
    private TextField out104;
    @FXML
    private TextField out105;
    @FXML
    private TextField txt61;
    @FXML
    private TextField txt62;
    @FXML
    private TextField out106;
    @FXML
    private TextField txt63;
    @FXML
    private TextField out107;
    @FXML
    private TextField txt64;
    @FXML
    private TextField out108;
    @FXML
    private TextField out109;
    @FXML
    private TextField out110;
    @FXML
    private TextField out111;
    @FXML
    private TextField out112;
    @FXML
    private TextField txt65;
    @FXML
    private TextField txt66;
    @FXML
    private TextField out113;
    @FXML
    private TextField txt67;
    @FXML
    private TextField out114;
    @FXML
    private TextField txt68;
    @FXML
    private TextField out115;
    @FXML
    private TextField out116;
    @FXML
    private TextField out117;
    @FXML
    private TextField out118;
    @FXML
    private TextField out119;
    @FXML
    private TextField txt69;
    @FXML
    private TextField txt70;
    @FXML
    private TextField out120;
    @FXML
    private TextField txt71;
    @FXML
    private TextField out121;
    @FXML
    private TextField txt72;
    @FXML
    private TextField out122;
    @FXML
    private TextField out123;
    @FXML
    private TextField out124;
    @FXML
    private TextField out125;
    @FXML
    private TextField out126;
    @FXML
    private TextField total1;
    @FXML
    private TextField total2;
    @FXML
    private TextField total3;
    @FXML
    private TextField total4;
    @FXML
    private TextField total5;
    @FXML
    private TextField total6;
    @FXML
    private TextField total7;
    @FXML
    private TextField total8;
    @FXML
    private TextField total9;
    @FXML
    private TextField total10;
    @FXML
    private TextField total11;
    @FXML
    private TextField MaqIn1;
    @FXML
    private TextField MaqIn3;
    @FXML
    private TextField MaqOut1;
    @FXML
    private TextField MaqIn2;
    @FXML
    private TextField MaqOut2;
    @FXML
    private Button btn1;
    @FXML
    private TextField h1;
    @FXML
    private TextField h2;
    @FXML
    private TextField h3;
    @FXML
    private Button btn2;

    private Nacimiento nacimiento1;
    private Nacimiento nacimiento2;
    private Nacimiento nacimiento3;
    private Nacimiento nacimiento4;
    private Nacimiento nacimiento5;
    private Nacimiento nacimiento6;
    private Nacimiento nacimiento7;
    private Nacimiento nacimiento8;
    private Nacimiento nacimiento9;
    private Nacimiento nacimiento10;
    private Nacimiento nacimiento11;
    private Nacimiento nacimiento12;
    private Nacimiento nacimiento13;
    private Nacimiento nacimiento14;
    private Nacimiento nacimiento15;
    private Nacimiento nacimiento16;
    private Nacimiento nacimiento17;
    private Nacimiento nacimiento18;

    private Map<String, Nacimiento> nacimientos;
    private Map<String, BiConsumer<Nacimiento, Integer>> setters;

    private List<TextField> inputText;
    private List<Nacimiento> allNacimientos;

    private List<TextField> percentagePNacidos;
    private List<TextField> percentagePSegunda;
    private List<TextField> percentagePDesecho;
    private List<TextField> quantityPVenta;
    private List<TextField> percentagePVenta;
    private List<TextField> quantityPTotal;
    private List<TextField> percentagePTotal;

    /**
     * Este método aplica enlaces (bindings) a diversas variables de la interfaz
     * de usuario para mantener sincronizados los datos subyacentes y la
     * representación de la interfaz de usuario. Los enlaces se actualizan
     * automáticamente cuando los valores observables cambian.
     *
     * El método itera sobre la lista de "allNacimientos" y aplica enlaces a
     * cada categoría de nacimiento. Utiliza streams para procesar todos los
     * "Nacimientos" y 'mapToInt' para obtener un atributo específico de cada
     * "Nacimiento" y transformarlo a un int.
     *
     * Después de la suma, se aplica el cálculo del porcentaje para cada
     * categoría. Si el total de "HCargados" es igual a cero (para evitar una
     * división por cero), el porcentaje se establece en 0.0; de lo contrario,
     * se realiza la división y se multiplica por 100 para obtener el
     * porcentaje.
     *
     * Finalmente, el método enlaza estos enlaces a las propiedades de texto
     * correspondientes en la interfaz de usuario, asegurando que cualquier
     * cambio en los datos se refleje automáticamente en la interfaz de usuario.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Ingresar solo numeric only
        inputText = Arrays.asList(txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12,
                txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23, txt24,
                txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35, txt36,
                txt37, txt38, txt39, txt40, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48,
                txt49, txt50, txt51, txt52, txt53, txt54, txt55, txt56, txt57, txt58, txt59, txt60,
                txt61, txt62, txt63, txt64, txt65, txt66, txt67, txt67, txt68, txt69, txt70, txt71,
                txt72, MaqIn1, MaqIn2, MaqIn3, h1, h3);

        //La aplicamos la regla para que solo acepte números
        for (TextField textField : inputText) {
            numericOnly(textField);
        }

        //Creamos un nacimiento por cada columna
        this.nacimiento1 = new Nacimiento();
        this.nacimiento2 = new Nacimiento();
        this.nacimiento3 = new Nacimiento();
        this.nacimiento4 = new Nacimiento();
        this.nacimiento5 = new Nacimiento();
        this.nacimiento6 = new Nacimiento();
        this.nacimiento7 = new Nacimiento();
        this.nacimiento8 = new Nacimiento();
        this.nacimiento9 = new Nacimiento();
        this.nacimiento10 = new Nacimiento();
        this.nacimiento11 = new Nacimiento();
        this.nacimiento12 = new Nacimiento();
        this.nacimiento13 = new Nacimiento();
        this.nacimiento14 = new Nacimiento();
        this.nacimiento15 = new Nacimiento();
        this.nacimiento16 = new Nacimiento();
        this.nacimiento17 = new Nacimiento();
        this.nacimiento18 = new Nacimiento();

        allNacimientos = Arrays.asList(nacimiento1, nacimiento2, nacimiento3, nacimiento4, nacimiento5, nacimiento6,
                nacimiento7, nacimiento8, nacimiento9, nacimiento10, nacimiento11, nacimiento12,
                nacimiento13, nacimiento14, nacimiento15, nacimiento16, nacimiento17, nacimiento18);

        percentagePNacidos = Arrays.asList(out1, out8, out15, out22, out29, out36, out43, out50, out57, out64, out71, out78, out85, out92, out99, out106, out113, out120);
        percentagePSegunda = Arrays.asList(out2, out9, out16, out23, out30, out37, out44, out51, out58, out65, out72, out79, out86, out93, out100, out107, out114, out121);
        percentagePDesecho = Arrays.asList(out3, out10, out17, out24, out31, out38, out45, out52, out59, out66, out73, out80, out87, out94, out101, out108, out115, out122);
        quantityPVenta = Arrays.asList(out4, out11, out18, out25, out32, out39, out46, out53, out60, out67, out74, out81, out88, out95, out102, out109, out116, out123);
        percentagePVenta = Arrays.asList(out5, out12, out19, out26, out33, out40, out47, out54, out61, out68, out75, out82, out89, out96, out103, out110, out117, out124);
        quantityPTotal = Arrays.asList(out6, out13, out20, out27, out34, out41, out48, out55, out62, out69, out76, out83, out90, out97, out104, out111, out118, out125);
        percentagePTotal = Arrays.asList(out7, out14, out21, out28, out35, out42, out49, out56, out63, out70, out77, out84, out91, out98, out105, out112, out119, out126);

        nacimientos = Map.ofEntries(
                Map.entry("txt1", nacimiento1),
                Map.entry("txt2", nacimiento1),
                Map.entry("txt3", nacimiento1),
                Map.entry("txt4", nacimiento1),
                Map.entry("txt5", nacimiento2),
                Map.entry("txt6", nacimiento2),
                Map.entry("txt7", nacimiento2),
                Map.entry("txt8", nacimiento2),
                Map.entry("txt9", nacimiento3),
                Map.entry("txt10", nacimiento3),
                Map.entry("txt11", nacimiento3),
                Map.entry("txt12", nacimiento3),
                Map.entry("txt13", nacimiento4),
                Map.entry("txt14", nacimiento4),
                Map.entry("txt15", nacimiento4),
                Map.entry("txt16", nacimiento4),
                Map.entry("txt17", nacimiento5),
                Map.entry("txt18", nacimiento5),
                Map.entry("txt19", nacimiento5),
                Map.entry("txt20", nacimiento5),
                Map.entry("txt21", nacimiento6),
                Map.entry("txt22", nacimiento6),
                Map.entry("txt23", nacimiento6),
                Map.entry("txt24", nacimiento6),
                Map.entry("txt25", nacimiento7),
                Map.entry("txt26", nacimiento7),
                Map.entry("txt27", nacimiento7),
                Map.entry("txt28", nacimiento7),
                Map.entry("txt29", nacimiento8),
                Map.entry("txt30", nacimiento8),
                Map.entry("txt31", nacimiento8),
                Map.entry("txt32", nacimiento8),
                Map.entry("txt33", nacimiento9),
                Map.entry("txt34", nacimiento9),
                Map.entry("txt35", nacimiento9),
                Map.entry("txt36", nacimiento9),
                Map.entry("txt37", nacimiento10),
                Map.entry("txt38", nacimiento10),
                Map.entry("txt39", nacimiento10),
                Map.entry("txt40", nacimiento10),
                Map.entry("txt41", nacimiento11),
                Map.entry("txt42", nacimiento11),
                Map.entry("txt43", nacimiento11),
                Map.entry("txt44", nacimiento11),
                Map.entry("txt45", nacimiento12),
                Map.entry("txt46", nacimiento12),
                Map.entry("txt47", nacimiento12),
                Map.entry("txt48", nacimiento12),
                Map.entry("txt49", nacimiento13),
                Map.entry("txt50", nacimiento13),
                Map.entry("txt51", nacimiento13),
                Map.entry("txt52", nacimiento13),
                Map.entry("txt53", nacimiento14),
                Map.entry("txt54", nacimiento14),
                Map.entry("txt55", nacimiento14),
                Map.entry("txt56", nacimiento14),
                Map.entry("txt57", nacimiento15),
                Map.entry("txt58", nacimiento15),
                Map.entry("txt59", nacimiento15),
                Map.entry("txt60", nacimiento15),
                Map.entry("txt61", nacimiento16),
                Map.entry("txt62", nacimiento16),
                Map.entry("txt63", nacimiento16),
                Map.entry("txt64", nacimiento16),
                Map.entry("txt65", nacimiento17),
                Map.entry("txt66", nacimiento17),
                Map.entry("txt67", nacimiento17),
                Map.entry("txt68", nacimiento17),
                Map.entry("txt69", nacimiento18),
                Map.entry("txt70", nacimiento18),
                Map.entry("txt71", nacimiento18),
                Map.entry("txt72", nacimiento18)
        );

        setters = Map.ofEntries(
                Map.entry("txt1", Nacimiento::setHCargados),
                Map.entry("txt2", Nacimiento::setPPrimera),
                Map.entry("txt3", Nacimiento::setPSegunda),
                Map.entry("txt4", Nacimiento::setPDespachado),
                Map.entry("txt5", Nacimiento::setHCargados),
                Map.entry("txt6", Nacimiento::setPPrimera),
                Map.entry("txt7", Nacimiento::setPSegunda),
                Map.entry("txt8", Nacimiento::setPDespachado),
                Map.entry("txt9", Nacimiento::setHCargados),
                Map.entry("txt10", Nacimiento::setPPrimera),
                Map.entry("txt11", Nacimiento::setPSegunda),
                Map.entry("txt12", Nacimiento::setPDespachado),
                Map.entry("txt13", Nacimiento::setHCargados),
                Map.entry("txt14", Nacimiento::setPPrimera),
                Map.entry("txt15", Nacimiento::setPSegunda),
                Map.entry("txt16", Nacimiento::setPDespachado),
                Map.entry("txt17", Nacimiento::setHCargados),
                Map.entry("txt18", Nacimiento::setPPrimera),
                Map.entry("txt19", Nacimiento::setPSegunda),
                Map.entry("txt20", Nacimiento::setPDespachado),
                Map.entry("txt21", Nacimiento::setHCargados),
                Map.entry("txt22", Nacimiento::setPPrimera),
                Map.entry("txt23", Nacimiento::setPSegunda),
                Map.entry("txt24", Nacimiento::setPDespachado),
                Map.entry("txt25", Nacimiento::setHCargados),
                Map.entry("txt26", Nacimiento::setPPrimera),
                Map.entry("txt27", Nacimiento::setPSegunda),
                Map.entry("txt28", Nacimiento::setPDespachado),
                Map.entry("txt29", Nacimiento::setHCargados),
                Map.entry("txt30", Nacimiento::setPPrimera),
                Map.entry("txt31", Nacimiento::setPSegunda),
                Map.entry("txt32", Nacimiento::setPDespachado),
                Map.entry("txt33", Nacimiento::setHCargados),
                Map.entry("txt34", Nacimiento::setPPrimera),
                Map.entry("txt35", Nacimiento::setPSegunda),
                Map.entry("txt36", Nacimiento::setPDespachado),
                Map.entry("txt37", Nacimiento::setHCargados),
                Map.entry("txt38", Nacimiento::setPPrimera),
                Map.entry("txt39", Nacimiento::setPSegunda),
                Map.entry("txt40", Nacimiento::setPDespachado),
                Map.entry("txt41", Nacimiento::setHCargados),
                Map.entry("txt42", Nacimiento::setPPrimera),
                Map.entry("txt43", Nacimiento::setPSegunda),
                Map.entry("txt44", Nacimiento::setPDespachado),
                Map.entry("txt45", Nacimiento::setHCargados),
                Map.entry("txt46", Nacimiento::setPPrimera),
                Map.entry("txt47", Nacimiento::setPSegunda),
                Map.entry("txt48", Nacimiento::setPDespachado),
                Map.entry("txt49", Nacimiento::setHCargados),
                Map.entry("txt50", Nacimiento::setPPrimera),
                Map.entry("txt51", Nacimiento::setPSegunda),
                Map.entry("txt52", Nacimiento::setPDespachado),
                Map.entry("txt53", Nacimiento::setHCargados),
                Map.entry("txt54", Nacimiento::setPPrimera),
                Map.entry("txt55", Nacimiento::setPSegunda),
                Map.entry("txt56", Nacimiento::setPDespachado),
                Map.entry("txt57", Nacimiento::setHCargados),
                Map.entry("txt58", Nacimiento::setPPrimera),
                Map.entry("txt59", Nacimiento::setPSegunda),
                Map.entry("txt60", Nacimiento::setPDespachado),
                Map.entry("txt61", Nacimiento::setHCargados),
                Map.entry("txt62", Nacimiento::setPPrimera),
                Map.entry("txt63", Nacimiento::setPSegunda),
                Map.entry("txt64", Nacimiento::setPDespachado),
                Map.entry("txt65", Nacimiento::setHCargados),
                Map.entry("txt66", Nacimiento::setPPrimera),
                Map.entry("txt67", Nacimiento::setPSegunda),
                Map.entry("txt68", Nacimiento::setPDespachado),
                Map.entry("txt69", Nacimiento::setHCargados),
                Map.entry("txt70", Nacimiento::setPPrimera),
                Map.entry("txt71", Nacimiento::setPSegunda),
                Map.entry("txt72", Nacimiento::setPDespachado)
        );

        //Binding (Invoca métodos segun el timpo de binding que es)
        for (int i = 0; i < allNacimientos.size(); i++) {
            setBindingPNacidos(percentagePNacidos.get(i), allNacimientos.get(i));
            setBindingPSegunda(percentagePSegunda.get(i), allNacimientos.get(i));
            setBindingPDesecho(percentagePDesecho.get(i), allNacimientos.get(i));
            setBindingSumVenta(quantityPVenta.get(i), allNacimientos.get(i));
            setBindingPVenta(percentagePVenta.get(i), allNacimientos.get(i));
            setBindingSumTotal(quantityPTotal.get(i), allNacimientos.get(i));
            setBindingPTotal(percentagePTotal.get(i), allNacimientos.get(i));
        }

        //Binding cargados
        IntegerBinding totalHCargadosBinding = Bindings.createIntegerBinding(() -> {
            return allNacimientos.stream()
                    .mapToInt(nacimiento -> nacimiento.getHCargados().get())
                    .sum();
        }, allNacimientos.stream()
                .map(Nacimiento::getHCargados)
                .toArray(ObservableNumberValue[]::new));

        total1.textProperty().bind(Bindings.createStringBinding(()
                -> Integer.toString(totalHCargadosBinding.get()),
                totalHCargadosBinding)
        );

        //Binding Nacidos + porcentaje
        IntegerBinding totalPNacidosBinding = Bindings.createIntegerBinding(() -> {
            return allNacimientos.stream()
                    .mapToInt(nacimiento -> nacimiento.getPPrimera().get())
                    .sum();
        }, allNacimientos.stream()
                .map(Nacimiento::getPPrimera)
                .toArray(ObservableNumberValue[]::new));

        total2.textProperty().bind(Bindings.createStringBinding(()
                -> Integer.toString(totalPNacidosBinding.get()),
                totalPNacidosBinding)
        );

        DoubleBinding porcentajePrimeraBinding = Bindings.createDoubleBinding(() -> {
            if (totalHCargadosBinding.get() == 0) {
                return 0.0;
            } else {
                return (double) totalPNacidosBinding.get() / totalHCargadosBinding.get() * 100;
            }
        }, totalHCargadosBinding, totalPNacidosBinding);

        total3.textProperty().bind(Bindings.createStringBinding(()
                -> String.format("%.2f", porcentajePrimeraBinding.get()),
                porcentajePrimeraBinding)
        );

        //Binding Segunda + porcentaje
        IntegerBinding totalPSegundaBinding = Bindings.createIntegerBinding(() -> {
            return allNacimientos.stream()
                    .mapToInt(nacimiento -> nacimiento.getPSegunda().get())
                    .sum();
        }, allNacimientos.stream()
                .map(Nacimiento::getPSegunda)
                .toArray(ObservableNumberValue[]::new));

        total4.textProperty().bind(Bindings.createStringBinding(()
                -> Integer.toString(totalPSegundaBinding.get()),
                totalPSegundaBinding)
        );

        DoubleBinding porcentajeSegundaBinding = Bindings.createDoubleBinding(() -> {
            if (totalHCargadosBinding.get() == 0) {
                return 0.0;
            } else {
                return (double) totalPSegundaBinding.get() / totalHCargadosBinding.get() * 100;
            }
        }, totalHCargadosBinding, totalPSegundaBinding);

        total5.textProperty().bind(Bindings.createStringBinding(()
                -> String.format("%.2f", porcentajeSegundaBinding.get()),
                porcentajeSegundaBinding)
        );

        //Binding Desecho + porcentaje
        IntegerBinding totalPDesechoBinding = Bindings.createIntegerBinding(() -> {
            return allNacimientos.stream()
                    .mapToInt(nacimiento -> nacimiento.getPDesecho().get())
                    .sum();
        }, allNacimientos.stream()
                .map(Nacimiento::getPDesecho)
                .toArray(ObservableNumberValue[]::new));

        total6.textProperty().bind(Bindings.createStringBinding(()
                -> Integer.toString(totalPDesechoBinding.get()),
                totalPDesechoBinding)
        );

        DoubleBinding porcentajeDesechoBinding = Bindings.createDoubleBinding(() -> {
            if (totalHCargadosBinding.get() == 0) {
                return 0.0;
            } else {
                return (double) totalPDesechoBinding.get() / totalHCargadosBinding.get() * 100;
            }
        }, totalHCargadosBinding, totalPDesechoBinding);

        total7.textProperty().bind(Bindings.createStringBinding(()
                -> String.format("%.2f", porcentajeDesechoBinding.get()),
                porcentajeDesechoBinding)
        );

        //Binding Venta + porcentaje
        IntegerBinding totalPVentaBinding = Bindings.createIntegerBinding(() -> {
            return allNacimientos.stream()
                    .mapToInt(nacimiento -> nacimiento.getPPrimera().get() + nacimiento.getPSegunda().get())
                    .sum();
        }, allNacimientos.stream()
                .flatMap(nacimiento -> Stream.of(nacimiento.getPPrimera(), nacimiento.getPSegunda()))
                .toArray(ObservableNumberValue[]::new));

        total8.textProperty().bind(Bindings.createStringBinding(()
                -> Integer.toString(totalPVentaBinding.get()),
                totalPVentaBinding)
        );

        DoubleBinding porcentajeVentaBinding = Bindings.createDoubleBinding(() -> {
            if (totalHCargadosBinding.get() == 0) {
                return 0.0;
            } else {
                return (double) (totalPNacidosBinding.get() + totalPSegundaBinding.get()) / totalHCargadosBinding.get() * 100;
            }
        }, totalHCargadosBinding, totalPDesechoBinding);

        total9.textProperty().bind(Bindings.createStringBinding(()
                -> String.format("%.2f", porcentajeVentaBinding.get()),
                porcentajeVentaBinding)
        );

        //Binding Total + porcentaje
        IntegerBinding totalPTotalBinding = Bindings.createIntegerBinding(() -> {
            return allNacimientos.stream()
                    .mapToInt(nacimiento -> nacimiento.getPPrimera().get() + nacimiento.getPSegunda().get() + nacimiento.getPDesecho().get())
                    .sum();
        }, allNacimientos.stream()
                .flatMap(nacimiento -> Stream.of(nacimiento.getPPrimera(), nacimiento.getPSegunda(), nacimiento.getPDesecho()))
                .toArray(ObservableNumberValue[]::new));

        total10.textProperty().bind(Bindings.createStringBinding(()
                -> Integer.toString(totalPTotalBinding.get()),
                totalPTotalBinding)
        );

        DoubleBinding porcentajeTotalBinding = Bindings.createDoubleBinding(() -> {
            if (totalHCargadosBinding.get() == 0) {
                return 0.0;
            } else {
                return (double) (totalPNacidosBinding.get() + totalPSegundaBinding.get() + totalPDesechoBinding.get()) / totalHCargadosBinding.get() * 100;
            }
        }, totalHCargadosBinding, totalPNacidosBinding);

        total11.textProperty().bind(Bindings.createStringBinding(()
                -> String.format("%.2f", porcentajeTotalBinding.get()),
                porcentajeTotalBinding)
        );

    }

    /**
     * Este método cierra la ventana actual y abre una nueva ventana con el menú
     * principal. Se carga el archivo FXML correspondiente al menú principal, se
     * establece la escena y se muestra la nueva ventana. Se cierra la ventana
     * actual obteniendo la escena del botón 'btnLimpiar' y llamando al método
     * 'close' en su 'Stage'. En caso de que la carga del archivo FXML falle, se
     * captura la excepción IOException y se imprime la traza de la pila.
     *
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

            Stage myStage = (Stage) this.btn1.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Este método privado restringe la entrada del usuario a solo valores
     * numéricos en un campo de texto especificado. Agrega un ChangeListener a
     * la propiedad de texto del TextField. Cada vez que se cambia el texto, se
     * verifica el nuevo valor. Si el nuevo valor no es un dígito (indicado por
     * el patrón de la expresión regular "\\d*"), entonces se reemplazan todos
     * los caracteres no numéricos en el nuevo valor con una cadena vacía, y se
     * establece este valor puramente numérico como el nuevo texto del
     * TextField.
     *
     * @param textField el campo de texto al que se va a agregar la restricción
     * numérica.
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
     * Este método de controlador, marcado con la anotación FXML, se usa para
     * establecer la 'carga' en función de un evento KeyEvent. Toma un KeyEvent
     * como parámetro, y asume que la fuente del evento es un TextField. Se
     * obtiene el ID y el texto del TextField y se almacenan en variables
     * locales. Se usa un operador ternario para verificar si el texto está
     * vacío; si lo está, se establece el valor en 0, de lo contrario, se
     * convierte el texto en un número entero. Luego, se recupera la 'Carga'
     * correspondiente al ID del TextField de un mapa 'cargas' y se almacena en
     * una variable local. Finalmente, se usa un mapa 'setters' para recuperar
     * un BiConsumer que acepta una 'Carga' y un valor entero, y se aplica este
     * BiConsumer a la 'Carga' y al valor recuperados.
     *
     * @param event el evento de teclado que desencadena este método.
     */
    @FXML
    private void setNacimiento(KeyEvent event) {
        String id = ((TextField) event.getSource()).getId();
        String text = ((TextField) event.getSource()).getText();

        int value = text.isEmpty() ? 0 : Integer.parseInt(text);

        Nacimiento nacimiento = nacimientos.get(id);
        setters.get(id).accept(nacimiento, value);
    }

    /**
     * Enlaza el contenido de un campo de texto de salida con el cálculo del
     * porcentaje de la primera categoría de nacimientos respecto al total de
     * nacimientos cargados.
     *
     * <p>
     * Este método utiliza la interfaz Bindings para crear un enlace que se
     * actualiza automáticamente cuando cambian las propiedades observables. El
     * valor de la propiedad de texto del campo de texto se actualiza
     * automáticamente para reflejar los cambios en las propiedades observables
     * de 'Nacimiento'.</p>
     *
     * @param out El campo de texto de salida donde se muestra el porcentaje
     * calculado.
     * @param nacimiento El objeto 'Nacimiento' que contiene los datos para el
     * cálculo.
     *
     * <p>
     * Si el número total de nacimientos cargados es cero, el método evita una
     * división por cero devolviendo "N/A". De lo contrario, calcula el
     * porcentaje de nacimientos de la primera categoría respecto al total de
     * nacimientos cargados, y actualiza el campo de texto de salida para
     * mostrar este porcentaje formateado a dos decimales.</p>
     */
    private void setBindingPNacidos(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            if (nacimiento.getHCargados().get() == 0) {
                return "N/A";
            } else {
                double pPrimera = (double) nacimiento.getPPrimera().get();
                double hCargados = (double) nacimiento.getHCargados().get();
                return String.format("%.2f", pPrimera / hCargados * 100);
            }
        }, nacimiento.getPPrimera(), nacimiento.getHCargados()));
    }

    /**
     * Enlaza el contenido de un campo de texto de salida con el cálculo del
     * porcentaje de la segunda categoría de nacimientos respecto al total de
     * nacimientos cargados.
     *
     * <p>
     * Este método utiliza la interfaz Bindings para crear un enlace que se
     * actualiza automáticamente cuando cambian las propiedades observables. El
     * valor de la propiedad de texto del campo de texto se actualiza
     * automáticamente para reflejar los cambios en las propiedades observables
     * de 'Nacimiento'.</p>
     *
     * @param out El campo de texto de salida donde se muestra el porcentaje
     * calculado.
     * @param nacimiento El objeto 'Nacimiento' que contiene los datos para el
     * cálculo.
     *
     * <p>
     * Si el número total de nacimientos cargados es cero, el método evita una
     * división por cero devolviendo "N/A". De lo contrario, calcula el
     * porcentaje de nacimientos de la segunda categoría respecto al total de
     * nacimientos cargados, y actualiza el campo de texto de salida para
     * mostrar este porcentaje formateado a dos decimales.</p>
     */
    private void setBindingPSegunda(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            if (nacimiento.getHCargados().get() == 0) {
                return "N/A";
            } else {
                double pSegunda = (double) nacimiento.getPSegunda().get();
                double hCargados = (double) nacimiento.getHCargados().get();
                return String.format("%.2f", pSegunda / hCargados * 100);
            }
        }, nacimiento.getPSegunda(), nacimiento.getHCargados()));
    }

    private void setBindingPDesecho(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            if (nacimiento.getHCargados().get() == 0) {
                return "N/A";
            } else {
                double pDesecho = (double) nacimiento.getPDesecho().get();
                double hCargados = (double) nacimiento.getHCargados().get();
                return String.format("%.2f", pDesecho / hCargados * 100);
            }
        }, nacimiento.getPDesecho(), nacimiento.getHCargados()));
    }

    private void setBindingSumVenta(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            int pPrimera = (int) nacimiento.getPPrimera().get();
            int pSegunda = (int) nacimiento.getPSegunda().get();
            return Integer.toString(pPrimera + pSegunda);
        }, nacimiento.getPPrimera(), nacimiento.getPSegunda()));
    }

    private void setBindingPVenta(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            if (nacimiento.getHCargados().get() == 0) {
                return "N/A";
            } else {
                double hCargados = (double) nacimiento.getHCargados().get();
                double pPrimera = (double) nacimiento.getPPrimera().get();
                double pSegunda = (double) nacimiento.getPSegunda().get();
                return String.format("%.2f", (pPrimera + pSegunda) / hCargados * 100);
            }

        }, nacimiento.getPPrimera(), nacimiento.getPSegunda(), nacimiento.getHCargados()));
    }

    private void setBindingSumTotal(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            int pPrimera = (int) nacimiento.getPPrimera().get();
            int pSegunda = (int) nacimiento.getPSegunda().get();
            int pDesecho = (int) nacimiento.getPDesecho().get();
            return Integer.toString(pPrimera + pSegunda + pDesecho);
        }, nacimiento.getPPrimera(), nacimiento.getPSegunda(), nacimiento.getPDesecho()));
    }

    private void setBindingPTotal(TextField out, Nacimiento nacimiento) {
        out.textProperty().bind(Bindings.createStringBinding(() -> {
            if (nacimiento.getHCargados().get() == 0) {
                return "N/A";
            } else {
                double hCargados = (double) nacimiento.getHCargados().get();
                double pPrimera = (double) nacimiento.getPPrimera().get();
                double pSegunda = (double) nacimiento.getPSegunda().get();
                double pDesecho = (double) nacimiento.getPDesecho().get();
                return String.format("%.2f", (pPrimera + pSegunda + pDesecho) / hCargados * 100);
            }

        }, nacimiento.getPPrimera(), nacimiento.getPSegunda(), nacimiento.getPDesecho(), nacimiento.getHCargados()));
    }

    /**
     * Divide la cantidad de trabajo entre dos máquinas según las cantidades
     * ingresadas por el usuario.
     *
     * <p>
     * Este método se activa cuando se realiza un evento 'ActionEvent' en el
     * control de la interfaz de usuario vinculado. Recoge los valores
     * ingresados por el usuario desde los campos de texto 'MaqIn1', 'MaqIn2' y
     * 'MaqIn3'. Luego, realiza el cálculo de la cantidad de trabajo que cada
     * máquina (MaqOut1 y MaqOut2) debería recibir basándose en las proporciones
     * dadas por 'MaqIn1' y 'MaqIn2'. Si la suma de las cantidades de 'MaqIn1' y
     * 'MaqIn2' es cero, se evita una división por cero mostrando un mensaje de
     * error al usuario.</p>
     *
     * @param event El evento de acción que desencadena este método.
     * Normalmente, este es un click del usuario.
     *
     * @throws NumberFormatException Si los contenidos de los campos de texto no
     * son números válidos, se lanza una excepción NumberFormatException, que se
     * maneja mostrando un mensaje de error al usuario.
     */
    @FXML
    private void divMaquinas(ActionEvent event) {
        try {
            // Obtenemos los valores de los textfields
            double cantidadMaqIn1 = Double.parseDouble(MaqIn1.getText());
            double cantidadMaqIn2 = Double.parseDouble(MaqIn2.getText());
            double cantidadMaqIn3 = Double.parseDouble(MaqIn3.getText());

            // Si la suma de las cantidades en maqIn1 y maqIn2 es cero, no podemos dividir
            if (cantidadMaqIn1 + cantidadMaqIn2 == 0) {
                // Aquí puedes manejar esta situación, quizás mostrando un mensaje al usuario
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("La suma de las cantidades en maqIn1 y maqIn2 no puede ser cero.");
                alert.showAndWait();
            } else {
                // Calculamos la cantidad correspondiente a cada maquina usando regla de tres
                double cantidadOut1 = cantidadMaqIn3 * cantidadMaqIn1 / (cantidadMaqIn1 + cantidadMaqIn2);
                double cantidadOut2 = cantidadMaqIn3 * cantidadMaqIn2 / (cantidadMaqIn1 + cantidadMaqIn2);

                // Mostramos los resultados en los textfields correspondientes, sin decimales
                MaqOut1.setText(String.format("%.0f", cantidadOut1));
                MaqOut2.setText(String.format("%.0f", cantidadOut2));
            }
        } catch (NumberFormatException e) {
            // Si los contenidos de los textfields no son números válidos, manejamos la excepción aquí
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor, introduce números válidos en los campos de texto.");
            alert.showAndWait();
        }
    }

    /**
     * Calcula el valor faltante entre tres campos de texto basándose en un
     * porcentaje.
     *
     * <p>
     * Este método es llamado cuando se produce un evento 'ActionEvent' en el
     * control de la interfaz de usuario vinculado. Primero, intenta recoger los
     * valores ingresados por el usuario desde los campos de texto 'h1', 'h2' y
     * 'h3'. A continuación, verifica qué dos valores están disponibles y
     * calcula el valor que falta usando un cálculo de porcentaje. Si solo se ha
     * proporcionado un valor o ninguno, se muestra un mensaje de error al
     * usuario.</p>
     *
     * <p>
     * La lógica de cálculo es la siguiente:
     * <ul>
     * <li>Si 'h1' y 'h2' están disponibles, 'h3' es calculado como el resultado
     * de 'h1' multiplicado por 'h2' dividido por 100.</li>
     * <li>Si 'h1' y 'h3' están disponibles, 'h2' es calculado como el resultado
     * de 'h3' dividido por 'h1' multiplicado por 100.</li>
     * <li>Si 'h2' y 'h3' están disponibles, 'h1' es calculado como el resultado
     * de 'h3' dividido por 'h2' multiplicado por 100.</li>
     * </ul></p>
     *
     * @param event El evento de acción que desencadena este método.
     * Normalmente, este es un click del usuario.
     *
     * @throws NumberFormatException Si los contenidos de los campos de texto no
     * son números válidos, se lanza una excepción NumberFormatException, que se
     * maneja mostrando un mensaje de error al usuario.
     */
    @FXML
    private void hxPercentage(ActionEvent event) {
        try {
            // Definimos los valores de los textfields como null al principio
            Integer cantidadH1 = null;
            Double cantidadH2 = null;
            Integer cantidadH3 = null;

            // Intentamos obtener los valores de los textfields
            if (!h1.getText().isEmpty()) {
                cantidadH1 = Integer.parseInt(h1.getText());
            }

            if (!h2.getText().isEmpty()) {
                cantidadH2 = Double.parseDouble(h2.getText());
            }

            if (!h3.getText().isEmpty()) {
                cantidadH3 = Integer.parseInt(h3.getText());
            }

            // Ahora verificamos qué valores tenemos disponibles y calculamos el que falta
            if (cantidadH1 != null && cantidadH2 != null) {
                // Si tenemos h1 y h2, calculamos h3
                cantidadH3 = (int) Math.round(cantidadH1 * (cantidadH2 / 100));
                h3.setText(String.valueOf(cantidadH3));
            } else if (cantidadH1 != null && cantidadH3 != null) {
                // Si tenemos h1 y h3, calculamos h2
                cantidadH2 = ((double) cantidadH3 / cantidadH1) * 100;
                h2.setText(String.format("%.2f", cantidadH2));
            } else if (cantidadH2 != null && cantidadH3 != null) {
                // Si tenemos h2 y h3, calculamos h1
                cantidadH1 = (int) Math.round(cantidadH3 / (cantidadH2 / 100));
                h1.setText(String.valueOf(cantidadH1));
            } else {
                // Si no tenemos dos valores, mostramos un mensaje de error
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Por favor, introduce dos valores para calcular el que falta.");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            // Si los contenidos de los textfields no son números válidos, manejamos la excepción aquí
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor, introduce números válidos en los campos de texto.");
            alert.showAndWait();
        }
    }
}
