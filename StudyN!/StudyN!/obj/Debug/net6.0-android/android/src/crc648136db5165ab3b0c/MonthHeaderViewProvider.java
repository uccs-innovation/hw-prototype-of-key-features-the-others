package crc648136db5165ab3b0c;


public class MonthHeaderViewProvider
	extends crc648136db5165ab3b0c.HeaderViewProvider
	implements
		mono.android.IGCUserPeer,
		com.devexpress.editors.pickers.providers.MonthHeaderViewProvider
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_check:(Landroid/view/View;II)Z:GetCheck_Landroid_view_View_IIHandler:DevExpress.Xamarin.Android.Editors.Pickers.Providers.IMonthHeaderViewProviderInvoker, DevExpress.Maui.Android.Editors\n" +
			"n_recycle:(Landroid/view/View;)V:GetRecycle_Landroid_view_View_Handler:DevExpress.Xamarin.Android.Editors.Pickers.Providers.IMonthHeaderViewProviderInvoker, DevExpress.Maui.Android.Editors\n" +
			"n_request:(II)Landroid/view/View;:GetRequest_IIHandler:DevExpress.Xamarin.Android.Editors.Pickers.Providers.IMonthHeaderViewProviderInvoker, DevExpress.Maui.Android.Editors\n" +
			"n_update:(Landroid/view/View;II)V:GetUpdate_Landroid_view_View_IIHandler:DevExpress.Xamarin.Android.Editors.Pickers.Providers.IMonthHeaderViewProviderInvoker, DevExpress.Maui.Android.Editors\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Editors.Wrappers.MonthHeaderViewProvider, DevExpress.Maui.Editors", MonthHeaderViewProvider.class, __md_methods);
	}


	public MonthHeaderViewProvider ()
	{
		super ();
		if (getClass () == MonthHeaderViewProvider.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Editors.Wrappers.MonthHeaderViewProvider, DevExpress.Maui.Editors", "", this, new java.lang.Object[] {  });
	}


	public boolean check (android.view.View p0, int p1, int p2)
	{
		return n_check (p0, p1, p2);
	}

	private native boolean n_check (android.view.View p0, int p1, int p2);


	public void recycle (android.view.View p0)
	{
		n_recycle (p0);
	}

	private native void n_recycle (android.view.View p0);


	public android.view.View request (int p0, int p1)
	{
		return n_request (p0, p1);
	}

	private native android.view.View n_request (int p0, int p1);


	public void update (android.view.View p0, int p1, int p2)
	{
		n_update (p0, p1, p2);
	}

	private native void n_update (android.view.View p0, int p1, int p2);

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
