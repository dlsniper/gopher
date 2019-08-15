package ro.florinpatan.gopher;

import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class GopherApplicationComponent {
    public GopherApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", GopherProgressBarUi.class.getName());
        UIManager.getDefaults().put(GopherProgressBarUi.class.getName(), GopherProgressBarUi.class);
    }
}
