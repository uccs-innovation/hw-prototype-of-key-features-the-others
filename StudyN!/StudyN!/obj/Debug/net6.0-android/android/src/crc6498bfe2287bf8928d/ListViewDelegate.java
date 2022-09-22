package crc6498bfe2287bf8928d;


public class ListViewDelegate
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxlistview.ListViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_canDrop:(II)Z:GetCanDrop_IIHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_canLoadMore:()Z:GetCanLoadMoreHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_canPullToRefresh:()Z:GetCanPullToRefreshHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_canStartDrag:(I)Z:GetCanStartDrag_IHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_drop:(II)V:GetDrop_IIHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_itemTap:(I)V:GetItemTap_IHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_loadMore:()V:GetLoadMoreHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"n_pullToRefresh:()V:GetPullToRefreshHandler:Com.Devexpress.Dxlistview.IListViewListenerInvoker, DevExpress.Maui.Android.CollectionView\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.CollectionView.Android.ListViewDelegate, DevExpress.Maui.CollectionView", ListViewDelegate.class, __md_methods);
	}


	public ListViewDelegate ()
	{
		super ();
		if (getClass () == ListViewDelegate.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.CollectionView.Android.ListViewDelegate, DevExpress.Maui.CollectionView", "", this, new java.lang.Object[] {  });
	}


	public boolean canDrop (int p0, int p1)
	{
		return n_canDrop (p0, p1);
	}

	private native boolean n_canDrop (int p0, int p1);


	public boolean canLoadMore ()
	{
		return n_canLoadMore ();
	}

	private native boolean n_canLoadMore ();


	public boolean canPullToRefresh ()
	{
		return n_canPullToRefresh ();
	}

	private native boolean n_canPullToRefresh ();


	public boolean canStartDrag (int p0)
	{
		return n_canStartDrag (p0);
	}

	private native boolean n_canStartDrag (int p0);


	public void drop (int p0, int p1)
	{
		n_drop (p0, p1);
	}

	private native void n_drop (int p0, int p1);


	public void itemTap (int p0)
	{
		n_itemTap (p0);
	}

	private native void n_itemTap (int p0);


	public void loadMore ()
	{
		n_loadMore ();
	}

	private native void n_loadMore ();


	public void pullToRefresh ()
	{
		n_pullToRefresh ();
	}

	private native void n_pullToRefresh ();

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
