package crc6498bfe2287bf8928d;


public class SwipeViewDelegate
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxlistview.swipes.SwipeViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_swipeItemTap:(IILcom/devexpress/dxlistview/swipes/DXSwipeGroup;)V:GetSwipeItemTap_IILcom_devexpress_dxlistview_swipes_DXSwipeGroup_Handler:Com.Devexpress.Dxlistview.Swipes.ISwipeViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.CollectionView.Android.SwipeViewDelegate, DevExpress.Maui.CollectionView", SwipeViewDelegate.class, __md_methods);
	}


	public SwipeViewDelegate ()
	{
		super ();
		if (getClass () == SwipeViewDelegate.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.CollectionView.Android.SwipeViewDelegate, DevExpress.Maui.CollectionView", "", this, new java.lang.Object[] {  });
	}


	public void swipeItemTap (int p0, int p1, com.devexpress.dxlistview.swipes.DXSwipeGroup p2)
	{
		n_swipeItemTap (p0, p1, p2);
	}

	private native void n_swipeItemTap (int p0, int p1, com.devexpress.dxlistview.swipes.DXSwipeGroup p2);

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
