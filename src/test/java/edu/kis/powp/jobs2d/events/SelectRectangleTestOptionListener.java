package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.factory.RectangleFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectRectangleTestOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();

        ComplexCommand command = RectangleFactory.createRectangle(driver, 0, 0, 200, 100);
        command.execute();
    }
}