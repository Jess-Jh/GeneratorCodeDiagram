
/*
 * 
 */
package concrete.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ConcretePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttributeJJD1CreationTool());
		paletteContainer.add(createClassJJD2CreationTool());
		paletteContainer.add(createMethodJJD3CreationTool());
		paletteContainer.add(createPackageJJD4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAgregationJJD1CreationTool());
		paletteContainer.add(createAssociationJJD2CreationTool());
		paletteContainer.add(createContainmentJJD3CreationTool());
		paletteContainer.add(createImplementJJD4CreationTool());
		paletteContainer.add(createInheritanceJJD5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttributeJJD1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcreteElementTypes.AttributeJJD_3003);
		types.add(ConcreteElementTypes.AttributeJJD_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AttributeJJD1CreationTool_title,
				Messages.AttributeJJD1CreationTool_desc, types);
		entry.setId("createAttributeJJD1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.AttributeJJD_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassJJD2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcreteElementTypes.ClassJJD_3002);
		types.add(ConcreteElementTypes.ClassJJD_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ClassJJD2CreationTool_title,
				Messages.ClassJJD2CreationTool_desc, types);
		entry.setId("createClassJJD2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.ClassJJD_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMethodJJD3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MethodJJD3CreationTool_title,
				Messages.MethodJJD3CreationTool_desc, Collections.singletonList(ConcreteElementTypes.MethodJJD_3004));
		entry.setId("createMethodJJD3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MethodJJD_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackageJJD4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcreteElementTypes.PackageJJD_2001);
		types.add(ConcreteElementTypes.PackageJJD_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PackageJJD4CreationTool_title,
				Messages.PackageJJD4CreationTool_desc, types);
		entry.setId("createPackageJJD4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.PackageJJD_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAgregationJJD1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AgregationJJD1CreationTool_title,
				Messages.AgregationJJD1CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.AgregationJJD_4001));
		entry.setId("createAgregationJJD1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.AgregationJJD_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociationJJD2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AssociationJJD2CreationTool_title,
				Messages.AssociationJJD2CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.AssociationJJD_4004));
		entry.setId("createAssociationJJD2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.AssociationJJD_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainmentJJD3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ContainmentJJD3CreationTool_title,
				Messages.ContainmentJJD3CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.ContainmentJJD_4003));
		entry.setId("createContainmentJJD3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.ContainmentJJD_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImplementJJD4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ImplementJJD4CreationTool_title,
				Messages.ImplementJJD4CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.ImplementJJD_4005));
		entry.setId("createImplementJJD4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.ImplementJJD_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInheritanceJJD5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InheritanceJJD5CreationTool_title,
				Messages.InheritanceJJD5CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.InheritanceJJD_4002));
		entry.setId("createInheritanceJJD5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.InheritanceJJD_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
