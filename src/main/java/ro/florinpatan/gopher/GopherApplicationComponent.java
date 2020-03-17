package ro.florinpatan.gopher;

import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationManager;

import javax.swing.*;

public class GopherApplicationComponent {
    public GopherApplicationComponent() {
        ApplicationManager.getApplication().getMessageBus().connect().subscribe(LafManagerListener.TOPIC, source -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", GopherProgressBarUi.class.getName());
        UIManager.getDefaults().put(GopherProgressBarUi.class.getName(), GopherProgressBarUi.class);
    }
}
