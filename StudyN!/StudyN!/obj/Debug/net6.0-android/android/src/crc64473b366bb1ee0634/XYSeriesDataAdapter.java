package crc64473b366bb1ee0634;


public class XYSeriesDataAdapter
	extends crc64473b366bb1ee0634.ChangableSeriesDataAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Charts.Android.XYSeriesDataAdapter, DevExpress.Maui.Charts", XYSeriesDataAdapter.class, __md_methods);
	}


	public XYSeriesDataAdapter ()
	{
		super ();
		if (getClass () == XYSeriesDataAdapter.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Charts.Android.XYSeriesDataAdapter, DevExpress.Maui.Charts", "", this, new java.lang.Object[] {  });
	}

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
