package crc64473b366bb1ee0634;


public class ChartDelegate
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxcharts.HintListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHide:()V:GetOnHideHandler:DevExpress.Xamarin.Android.Charts.IHintListenerInvoker, DevExpress.Maui.Android.Charts\n" +
			"n_onShow:(Lcom/devexpress/dxcharts/HintInfo;)V:GetOnShow_Lcom_devexpress_dxcharts_HintInfo_Handler:DevExpress.Xamarin.Android.Charts.IHintListenerInvoker, DevExpress.Maui.Android.Charts\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Charts.Android.ChartDelegate, DevExpress.Maui.Charts", ChartDelegate.class, __md_methods);
	}


	public ChartDelegate ()
	{
		super ();
		if (getClass () == ChartDelegate.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Charts.Android.ChartDelegate, DevExpress.Maui.Charts", "", this, new java.lang.Object[] {  });
	}


	public void onHide ()
	{
		n_onHide ();
	}

	private native void n_onHide ();


	public void onShow (com.devexpress.dxcharts.HintInfo p0)
	{
		n_onShow (p0);
	}

	private native void n_onShow (com.devexpress.dxcharts.HintInfo p0);

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
