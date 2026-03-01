import java.awt.*;
import java.awt.event.*;

class ActionEx implements MouseListener {

    Label status;
    Frame f;

    ActionEx() {
        status = new Label("This is mouse");
        f = new Frame("mouse");
        f.add(status);
        f.addMouseListener(this);

        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new ActionEx();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        status.setText("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        status.setText("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        status.setText("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        status.setText("entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        status.setText("exited");
    }
}
