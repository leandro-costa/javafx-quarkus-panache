package br.edu.ifba.saj.ads.controller;

import java.io.IOException;

import br.edu.ifba.saj.ads.QuarkusFxApp;
import br.edu.ifba.saj.ads.model.Cliente;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;
import javafx.fxml.FXML;

@Singleton
public class PrimaryController {

    @FXML
    @Transactional
    public void switchToSecondary() throws IOException {
        Cliente.count();
        QuarkusFxApp.setRoot("controller/secondary.fxml");
    }
}
