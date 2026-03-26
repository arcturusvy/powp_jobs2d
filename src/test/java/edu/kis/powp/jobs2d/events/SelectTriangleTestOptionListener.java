package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.factory.TriangleFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleTestOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver job2dDriver = DriverFeature.getDriverManager().getCurrentDriver();

        ComplexCommand command = TriangleFactory.createTriangle(job2dDriver, 0, 0, 200, 100);        command.execute();
        command.execute();
    }
}
