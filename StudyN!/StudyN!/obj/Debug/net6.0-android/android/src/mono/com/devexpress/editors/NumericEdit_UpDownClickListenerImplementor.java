package mono.com.devexpress.editors;


public class NumericEdit_UpDownClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.NumericEdit.UpDownClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_clearClicked:()V:GetClearClickedHandler:DevExpress.Xamarin.Android.Editors.NumericEdit/IUpDownClickListenerInvoker, DevExpress.Maui.Android.Editors\n" +
			"n_downClicked:()V:GetDownClickedHandler:DevExpress.Xamarin.Android.Editors.NumericEdit/IUpDownClickListenerInvoker, DevExpress.Maui.Android.Editors\n" +
			"n_upClicked:()V:GetUpClickedHandler:DevExpress.Xamarin.Android.Editors.NumericEdit/IUpDownClickListenerInvoker, DevExpress.Maui.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Editors.NumericEdit+IUpDownClickListenerImplementor, DevExpress.Maui.Android.Editors", NumericEdit_UpDownClickListenerImplementor.class, __md_methods);
	}


	public NumericEdit_UpDownClickListenerImplementor ()
	{
		super ();
		if (getClass () == NumericEdit_UpDownClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Editors.NumericEdit+IUpDownClickListenerImplementor, DevExpress.Maui.Android.Editors", "", this, new java.lang.Object[] {  });
	}


	public void clearClicked ()
	{
		n_clearClicked ();
	}

	private native void n_clearClicked ();


	public void downClicked ()
	{
		n_downClicked ();
	}

	private native void n_downClicked ();


	public void upClicked ()
	{
		n_upClicked ();
	}

	private native void n_upClicked ();

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
