package crc64457cb393c7638683;


public class XamarinEditorsCreator
	extends com.devexpress.editors.dataForm.protocols.DataFormEditorFactory
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_create:(Landroid/content/Context;Lcom/devexpress/editors/dataForm/protocols/EditorType;II)Lcom/devexpress/editors/dataForm/protocols/DXDataFormEditorItem;:GetCreate_Landroid_content_Context_Lcom_devexpress_editors_dataForm_protocols_EditorType_IIHandler\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Editors.DataForm.XamarinEditorsCreator, DevExpress.Maui.Editors", XamarinEditorsCreator.class, __md_methods);
	}


	public XamarinEditorsCreator ()
	{
		super ();
		if (getClass () == XamarinEditorsCreator.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Editors.DataForm.XamarinEditorsCreator, DevExpress.Maui.Editors", "", this, new java.lang.Object[] {  });
	}


	public com.devexpress.editors.dataForm.protocols.DXDataFormEditorItem create (android.content.Context p0, com.devexpress.editors.dataForm.protocols.EditorType p1, int p2, int p3)
	{
		return n_create (p0, p1, p2, p3);
	}

	private native com.devexpress.editors.dataForm.protocols.DXDataFormEditorItem n_create (android.content.Context p0, com.devexpress.editors.dataForm.protocols.EditorType p1, int p2, int p3);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
