package uidiagram.diagram.edit.notifications;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;

import uidiagram.TemplateWidget;

public class NotificationEvent {
	
	public static void handleNotificationEventTemplate(Notification notification, Object getModel) {
        // SET was the type i need
        if (notification.getEventType() == Notification.SET) {
            // the notifier sends his new Bounds ...
            if (notification.getNotifier() instanceof BoundsImpl) {
                BoundsImpl notifier = (BoundsImpl) notification.getNotifier();
                // for my special coordinate mapping i also need the node,
                // so i save it in this variable ...
                NodeImpl node = (NodeImpl) getModel;
                // get the corresponding FieldLabel Object from the model
                TemplateWidget model = (TemplateWidget) node.getElement();

                if (notification.getFeature() instanceof EAttributeImpl) {
                    // Get the attribute that has changed
                    EAttributeImpl attribute = (EAttributeImpl) notification.getFeature();
                    // set the values for x and y in the model

                    if (notifier.getWidth() == -1) { 
                        model.setWidth(650);
                    } else { 
                        model.setWidth(notifier.getWidth());
                        model.setHeight(notifier.getHeight());
                    }
                    model.setPositionX(notifier.getX());
                    model.setPositionY(notifier.getY()); 
                }
            }
            if (notification.getNotifier() instanceof ShapeImpl) {

                ShapeImpl fontStyleImpl = (ShapeImpl) notification.getNotifier();
                int fontColor = fontStyleImpl.getFontColor();
                int fontHeight = fontStyleImpl.getFontHeight();
                String fontName = fontStyleImpl.getFontName();
                boolean bold = fontStyleImpl.isBold();
                NodeImpl node = (NodeImpl) getModel;
                TemplateWidget model = (TemplateWidget) node.getElement();


                //model.setFontSize(fontHeight);
                //model.setTextColor("" + fontColor);
                model.setBackgroundColor("" + fontStyleImpl.getFillColor());
                //model.setFontName(fontName);
                //model.setNegrilla(bold);
            }
        }
    }

}
