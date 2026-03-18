package edu.kis.powp.jobs2d.drivers.adapter;

import java.util.function.Supplier;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver {

    private final DrawPanelController drawPanelController;
    private final Supplier<ILine> lineFactoryMethod;

    private int x;
    private int y;

    public LineDrawerAdapter(Supplier<ILine> lineFactoryMethod) {
        this.drawPanelController = DrawerFeature.getDrawerController();
        this.lineFactoryMethod = lineFactoryMethod;
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = lineFactoryMethod.get();

        line.setStartCoordinates(this.x, this.y);
        line.setEndCoordinates(x, y);

        drawPanelController.drawLine(line);

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Line Drawer Adapter";
    }
}