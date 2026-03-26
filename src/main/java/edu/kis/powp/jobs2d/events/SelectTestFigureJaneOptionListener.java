package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverManagerAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

public class SelectTestFigureJaneOptionListener implements ActionListener {

    private final DriverManager driverManager;

    public SelectTestFigureJaneOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(new DriverManagerAdapter(driverManager));
    }
}