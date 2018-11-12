package simuladorderestaurante;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 * 
 */
public class TelaInicial extends Application {

    private Stage       stage;
    private Scene       scene;
    private AnchorPane  pane;
    private Label       lbTelaInicial;
    private Button      btIniciarSimulacao, btConsultaDeResultados;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        initComponents();
        initLayout();
        iniListeners();
        stage.show();

    }

    public void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(800 , 600);
        scene = new Scene(pane);
        
        btIniciarSimulacao      = new Button    ("Iniciar Simulação");
        btConsultaDeResultados  = new Button    ("Consulta de Resultados");
        lbTelaInicial           = new Label     ("Tela Inicial");
        
        pane.getChildren().addAll(btIniciarSimulacao , btConsultaDeResultados , lbTelaInicial);
        stage.setScene(scene);
    }

    public void initLayout() {
        lbTelaInicial.setLayoutX(10);
        btIniciarSimulacao.setLayoutX(350);
        btIniciarSimulacao.setLayoutY(275);
        btConsultaDeResultados.setLayoutX(btIniciarSimulacao.getLayoutX() - 15);
        btConsultaDeResultados.setLayoutY(btIniciarSimulacao.getLayoutY() + 30);
    }

    public void iniListeners() {
        btIniciarSimulacao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new TeladeConfiguracaoInicial().start(stage);                
            }
        });

        btConsultaDeResultados.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new ConsultaDeResultados().start(stage);
            }
        });

    }

    public static void main(String[] args) {
        launch(args);

    }

}
