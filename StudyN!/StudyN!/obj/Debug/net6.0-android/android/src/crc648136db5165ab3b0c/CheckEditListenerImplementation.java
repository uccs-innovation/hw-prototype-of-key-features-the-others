package crc648136db5165ab3b0c;


public class CheckEditListenerImplementation
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.CheckEdit.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onValueChanged:(Lcom/devexpress/editors/CheckEdit;I)V:GetOnValueChanged_Lcom_devexpress_editors_CheckEdit_IHandler:DevExpress.Xamarin.Android.Editors.CheckEdit/IListenerInvoker, DevExpress.Maui.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Editors.Wrappers.CheckEditListenerImplementation, DevExpress.Maui.Editors", CheckEditListenerImplementation.class, __md_methods);
	}


	public CheckEditListenerImplementation ()
	{
		super ();
		if (getClass () == CheckEditListenerImplementation.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Editors.Wrappers.CheckEditListenerImplementation, DevExpress.Maui.Editors", "", this, new java.lang.Object[] {  });
	}


	public void onValueChanged (com.devexpress.editors.CheckEdit p0, int p1)
	{
		n_onValueChanged (p0, p1);
	}

	private native void n_onValueChanged (com.devexpress.editors.CheckEdit p0, int p1);

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
