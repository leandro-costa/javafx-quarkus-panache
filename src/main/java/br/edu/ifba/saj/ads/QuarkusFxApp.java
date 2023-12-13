package br.edu.ifba.saj.ads;

import java.io.IOException;
import java.net.URL;

import com.codesimcoe.quarkus.fx.extension.runtime.PrimaryStage;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuarkusFxApp {

  private static Scene scene;
  @Inject
  FXMLLoader fxmlLoader;
  

  public void start(@Observes @PrimaryStage Stage stage) {
    try {
      URL fxml = this.getClass().getResource("controller/primary.fxml");
      Parent fxmlParent = fxmlLoader.load(fxml.openStream());

      scene = new Scene(fxmlParent, 640, 480);
      stage.setScene(scene);
      stage.show();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static void setRoot(String fxmlFileName) throws IOException {
    URL fxml = QuarkusFxApp.class.getResource(fxmlFileName);
    System.out.println(fxml);
    Parent fxmlParent = new FXMLLoader().load(fxml.openStream());
    scene.setRoot(fxmlParent);
  }
    
}
