package zad2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class MousePressListener  extends MouseAdapter {
	Consumer  e ;
	
	public MousePressListener(Consumer w) {
           this.e=w;
	}

	public void mouseClicked(MouseEvent eve) {
        if (eve.getButton()==MouseEvent.BUTTON3 || eve.getButton()==MouseEvent.BUTTON1) {
        	 e.accept(this);
           }
	}
}
