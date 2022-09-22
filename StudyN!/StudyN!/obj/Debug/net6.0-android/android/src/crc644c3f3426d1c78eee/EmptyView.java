package crc644c3f3426d1c78eee;


public class EmptyView
	extends android.view.View
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getVisibility:()I:GetGetVisibilityHandler\n" +
			"n_setVisibility:(I)V:GetSetVisibility_IHandler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Controls.Wrappers.EmptyView, DevExpress.Maui.Controls", EmptyView.class, __md_methods);
	}


	public EmptyView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == EmptyView.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Controls.Wrappers.EmptyView, DevExpress.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public EmptyView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == EmptyView.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Controls.Wrappers.EmptyView, DevExpress.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public EmptyView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == EmptyView.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Controls.Wrappers.EmptyView, DevExpress.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public EmptyView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == EmptyView.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Controls.Wrappers.EmptyView, DevExpress.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public int getVisibility ()
	{
		return n_getVisibility ();
	}

	private native int n_getVisibility ();


	public void setVisibility (int p0)
	{
		n_setVisibility (p0);
	}

	private native void n_setVisibility (int p0);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);

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
