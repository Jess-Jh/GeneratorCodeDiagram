package uidiagram.diagram.edit.notifications;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;

import uidiagram.Group;
import uidiagram.TemplateWidget;
import uidiagram.UserInterface;

public class NotificationEvent {
	
	private static long idCounter = 0;
	
	public static synchronized String generateUniqueID() {
        long currentTimeMillis = System.currentTimeMillis();
        return String.valueOf(currentTimeMillis) + "_" + idCounter++;
    }
	
	public static void handleNotificationEventTemplate(Notification notification, Object getModel) {
		
		 String uniqueID = generateUniqueID();
		 
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
                    model.setIdTemplate(uniqueID);
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
	
	public static void handleNotificationEventContainer(Notification notification, Group getModel) {
		
		 String uniqueID = generateUniqueID();
		 
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
                   model.setIdTemplate(uniqueID);
               }
           }
           if (notification.getNotifier() instanceof ShapeImpl) {

               ShapeImpl fontStyleImpl = (ShapeImpl) notification.getNotifier();
               int fontColor = fontStyleImpl.getFontColor();
               int fontHeight = fontStyleImpl.getFillColor();
               String fontName = fontStyleImpl.getFontName();
               int fontColorBorder = fontStyleImpl.getLineColor();
               boolean bold = fontStyleImpl.isBold();
               NodeImpl node = (NodeImpl) getModel;
               TemplateWidget model = (TemplateWidget) node.getElement();


               //model.setTextColor("" + fontColor);
               model.setBackgroundColor("" + fontStyleImpl.getFillColor());
               //model.setFontName(fontName);
               //model.setNegrilla(bold);
           }
       }
   }
	
	public static void handleNotificationEventUserInterface(Notification notification, Object getModel) {
		
		String uniqueID = generateUniqueID();
		// SET was the type i need
		if (notification.getEventType() == Notification.SET) {
			// the notifier sends his new Bounds ...
			if (notification.getNotifier() instanceof BoundsImpl) {
				BoundsImpl notifier = (BoundsImpl) notification.getNotifier();
				// for my special coordinate mapping i also need the node,
				// so i save it in this variable ...
				NodeImpl node = (NodeImpl) getModel;
				// get the corresponding FieldLabel Object from the model
				UserInterface model = (UserInterface) node.getElement();

				if (notification.getFeature() instanceof EAttributeImpl) {
					// Get the attribute that has changed
					EAttributeImpl attribute = (EAttributeImpl) notification.getFeature();
					// set the values for x and y in the model

					if (notifier.getWidth() == -1) {
						model.setWidth(480);
					} else {
						model.setWidth(notifier.getWidth());
						model.setHeight(notifier.getHeight());
					}
					model.setPositionX(notifier.getX());
					model.setPositionY(notifier.getY());
					model.setIdInterface(uniqueID);
				}
			}
			if (notification.getNotifier() instanceof ShapeImpl) {

				ShapeImpl fontStyleImpl = (ShapeImpl) notification.getNotifier();
				int fontColor = fontStyleImpl.getFontColor();
				int fontHeight = fontStyleImpl.getFontHeight();
				String fontName = fontStyleImpl.getFontName();
				boolean bold = fontStyleImpl.isBold();
				NodeImpl node = (NodeImpl) getModel;
				UserInterface model = (UserInterface) node.getElement();

				// model.setFontSize(fontHeight);
				// model.setTextColor("" + fontColor);
				model.setBackgroundColor("" + fontStyleImpl.getFillColor());
				// model.setFontName(fontName);
				// model.setNegrilla(bold);
			}
		}
    }
	

}
