
/*
 * 
 */
package uidiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UidiagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAppbar1CreationTool());
		paletteContainer.add(createButton2CreationTool());
		paletteContainer.add(createCheckbox3CreationTool());
		paletteContainer.add(createColumn4CreationTool());
		paletteContainer.add(createComboBox5CreationTool());
		paletteContainer.add(createDatePicker6CreationTool());
		paletteContainer.add(createGroup7CreationTool());
		paletteContainer.add(createGroupColumn8CreationTool());
		paletteContainer.add(createGroupRow9CreationTool());
		paletteContainer.add(createInput10CreationTool());
		paletteContainer.add(createLabel11CreationTool());
		paletteContainer.add(createListView12CreationTool());
		paletteContainer.add(createRadioButton13CreationTool());
		paletteContainer.add(createSwitch14CreationTool());
		paletteContainer.add(createTabbar15CreationTool());
		paletteContainer.add(createTable16CreationTool());
		paletteContainer.add(createUserInterface17CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAppbar1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Appbar_3007);
		types.add(UidiagramElementTypes.Appbar_3036);
		types.add(UidiagramElementTypes.Appbar_3024);
		types.add(UidiagramElementTypes.Appbar_3084);
		types.add(UidiagramElementTypes.Appbar_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Appbar1CreationTool_title,
				Messages.Appbar1CreationTool_desc, types);
		entry.setId("createAppbar1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Appbar_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(UidiagramElementTypes.Button_3062);
		types.add(UidiagramElementTypes.Button_3063);
		types.add(UidiagramElementTypes.Button_3009);
		types.add(UidiagramElementTypes.Button_3038);
		types.add(UidiagramElementTypes.Button_3026);
		types.add(UidiagramElementTypes.Button_3086);
		types.add(UidiagramElementTypes.Button_3052);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button2CreationTool_title,
				Messages.Button2CreationTool_desc, types);
		entry.setId("createButton2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckbox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Checkbox_3011);
		types.add(UidiagramElementTypes.Checkbox_3040);
		types.add(UidiagramElementTypes.Checkbox_3028);
		types.add(UidiagramElementTypes.Checkbox_3088);
		types.add(UidiagramElementTypes.Checkbox_3054);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Checkbox3CreationTool_title,
				Messages.Checkbox3CreationTool_desc, types);
		entry.setId("createCheckbox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Checkbox_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column4CreationTool_title,
				Messages.Column4CreationTool_desc, Collections.singletonList(UidiagramElementTypes.Column_3019));
		entry.setId("createColumn4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Column_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.ComboBox_3015);
		types.add(UidiagramElementTypes.ComboBox_3092);
		types.add(UidiagramElementTypes.ComboBox_3032);
		types.add(UidiagramElementTypes.ComboBox_3044);
		types.add(UidiagramElementTypes.ComboBox_3058);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox5CreationTool_title,
				Messages.ComboBox5CreationTool_desc, types);
		entry.setId("createComboBox5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ComboBox_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDatePicker6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.DatePicker_3016);
		types.add(UidiagramElementTypes.DatePicker_3093);
		types.add(UidiagramElementTypes.DatePicker_3033);
		types.add(UidiagramElementTypes.DatePicker_3045);
		types.add(UidiagramElementTypes.DatePicker_3059);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DatePicker6CreationTool_title,
				Messages.DatePicker6CreationTool_desc, types);
		entry.setId("createDatePicker6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.DatePicker_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Group_3001);
		types.add(UidiagramElementTypes.Group_3002);
		types.add(UidiagramElementTypes.Group_3004);
		types.add(UidiagramElementTypes.Group_3006);
		types.add(UidiagramElementTypes.Group_3081);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group7CreationTool_title,
				Messages.Group7CreationTool_desc, types);
		entry.setId("createGroup7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroupColumn8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.GroupColumn_3003);
		types.add(UidiagramElementTypes.GroupColumn_3082);
		types.add(UidiagramElementTypes.GroupColumn_3021);
		types.add(UidiagramElementTypes.GroupColumn_3020);
		types.add(UidiagramElementTypes.GroupColumn_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GroupColumn8CreationTool_title,
				Messages.GroupColumn8CreationTool_desc, types);
		entry.setId("createGroupColumn8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.GroupColumn_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroupRow9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.GroupRow_3005);
		types.add(UidiagramElementTypes.GroupRow_3022);
		types.add(UidiagramElementTypes.GroupRow_3083);
		types.add(UidiagramElementTypes.GroupRow_3023);
		types.add(UidiagramElementTypes.GroupRow_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GroupRow9CreationTool_title,
				Messages.GroupRow9CreationTool_desc, types);
		entry.setId("createGroupRow9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.GroupRow_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Input_3012);
		types.add(UidiagramElementTypes.Input_3041);
		types.add(UidiagramElementTypes.Input_3029);
		types.add(UidiagramElementTypes.Input_3089);
		types.add(UidiagramElementTypes.Input_3055);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input10CreationTool_title,
				Messages.Input10CreationTool_desc, types);
		entry.setId("createInput10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Input_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(UidiagramElementTypes.Label_3064);
		types.add(UidiagramElementTypes.Label_3065);
		types.add(UidiagramElementTypes.Label_3010);
		types.add(UidiagramElementTypes.Label_3039);
		types.add(UidiagramElementTypes.Label_3027);
		types.add(UidiagramElementTypes.Label_3087);
		types.add(UidiagramElementTypes.Label_3053);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label11CreationTool_title,
				Messages.Label11CreationTool_desc, types);
		entry.setId("createLabel11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createListView12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.ListView_3013);
		types.add(UidiagramElementTypes.ListView_3042);
		types.add(UidiagramElementTypes.ListView_3030);
		types.add(UidiagramElementTypes.ListView_3090);
		types.add(UidiagramElementTypes.ListView_3056);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ListView12CreationTool_title,
				Messages.ListView12CreationTool_desc, types);
		entry.setId("createListView12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ListView_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.RadioButton_3014);
		types.add(UidiagramElementTypes.RadioButton_3091);
		types.add(UidiagramElementTypes.RadioButton_3031);
		types.add(UidiagramElementTypes.RadioButton_3043);
		types.add(UidiagramElementTypes.RadioButton_3057);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadioButton13CreationTool_title,
				Messages.RadioButton13CreationTool_desc, types);
		entry.setId("createRadioButton13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.RadioButton_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSwitch14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Switch_3017);
		types.add(UidiagramElementTypes.Switch_3094);
		types.add(UidiagramElementTypes.Switch_3034);
		types.add(UidiagramElementTypes.Switch_3046);
		types.add(UidiagramElementTypes.Switch_3060);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Switch14CreationTool_title,
				Messages.Switch14CreationTool_desc, types);
		entry.setId("createSwitch14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Switch_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTabbar15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Tabbar_3008);
		types.add(UidiagramElementTypes.Tabbar_3037);
		types.add(UidiagramElementTypes.Tabbar_3025);
		types.add(UidiagramElementTypes.Tabbar_3085);
		types.add(UidiagramElementTypes.Tabbar_3051);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Tabbar15CreationTool_title,
				Messages.Tabbar15CreationTool_desc, types);
		entry.setId("createTabbar15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Tabbar_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UidiagramElementTypes.Table_3018);
		types.add(UidiagramElementTypes.Table_3095);
		types.add(UidiagramElementTypes.Table_3035);
		types.add(UidiagramElementTypes.Table_3047);
		types.add(UidiagramElementTypes.Table_3061);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table16CreationTool_title,
				Messages.Table16CreationTool_desc, types);
		entry.setId("createTable16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Table_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface17CreationTool_title,
				Messages.UserInterface17CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
