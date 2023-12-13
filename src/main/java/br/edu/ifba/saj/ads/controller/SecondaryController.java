package br.edu.ifba.saj.ads.controller;

import java.io.IOException;

import br.edu.ifba.saj.ads.QuarkusFxApp;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import javafx.fxml.FXML;
@Singleton
public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        QuarkusFxApp.setRoot("controller/primary.fxml");
    }
}