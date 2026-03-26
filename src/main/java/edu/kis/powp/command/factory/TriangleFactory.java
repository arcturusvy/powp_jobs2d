package edu.kis.powp.command.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class TriangleFactory {
    public static ComplexCommand createTriangle(Job2dDriver driver, int x, int y, int width, int height) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(driver, x, y));
        command.addCommand(new OperateToCommand(driver, x + width, height));
        command.addCommand(new OperateToCommand(driver,x + width, y + height));
        command.addCommand(new OperateToCommand(driver ,x, y + height));
        command.addCommand(new OperateToCommand(driver, x, y));

        return command;
    }
}
