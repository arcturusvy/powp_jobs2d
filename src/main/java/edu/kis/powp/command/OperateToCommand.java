package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private final Job2dDriver job2dDriver;
    private final int x;
    private final int y;

    public OperateToCommand(Job2dDriver job2dDriver, int x, int y) {
        this.job2dDriver = job2dDriver;
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute() {
        job2dDriver.operateTo(x, y);
    }
}
