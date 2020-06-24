package ro.florinpatan.gopher;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationManager;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GopherApplicationComponent implements LafManagerListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", GopherProgressBarUi.class.getName());
        UIManager.getDefaults().put(GopherProgressBarUi.class.getName(), GopherProgressBarUi.class);
    }
}
