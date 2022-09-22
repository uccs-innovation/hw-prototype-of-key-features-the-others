package mono.com.devexpress.dxcharts;


public class DrawingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxcharts.DrawingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDrawingFinished:()V:GetOnDrawingFinishedHandler:DevExpress.Xamarin.Android.Charts.IDrawingListenerInvoker, DevExpress.Maui.Android.Charts\n" +
			"n_onDrawingStarted:()V:GetOnDrawingStartedHandler:DevExpress.Xamarin.Android.Charts.IDrawingListenerInvoker, DevExpress.Maui.Android.Charts\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Xamarin.Android.Charts.IDrawingListenerImplementor, DevExpress.Maui.Android.Charts", DrawingListenerImplementor.class, __md_methods);
	}


	public DrawingListenerImplementor ()
	{
		super ();
		if (getClass () == DrawingListenerImplementor.class)
			mono.android.TypeManager.Activate ("DevExpress.Xamarin.Android.Charts.IDrawingListenerImplementor, DevExpress.Maui.Android.Charts", "", this, new java.lang.Object[] {  });
	}


	public void onDrawingFinished ()
	{
		n_onDrawingFinished ();
	}

	private native void n_onDrawingFinished ();


	public void onDrawingStarted ()
	{
		n_onDrawingStarted ();
	}

	private native void n_onDrawingStarted ();

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
