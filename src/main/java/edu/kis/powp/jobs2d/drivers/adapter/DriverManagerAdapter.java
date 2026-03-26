package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

/**
 * Adapter for FiguresJane.
 * It extends AbstractDriver, but delegates actual drawing
 * to the currently selected Job2dDriver from DriverManager.
 */
public class DriverManagerAdapter extends AbstractDriver {

    private final DriverManager driverManager;

    public DriverManagerAdapter(DriverManager driverManager) {
        super(0, 0);
        this.driverManager = driverManager;
    }

    @Override
    public void operateTo(int x, int y) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        currentDriver.setPosition(getX(), getY());
        currentDriver.operateTo(x, y);

        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "DriverManagerAdapter";
    }
}