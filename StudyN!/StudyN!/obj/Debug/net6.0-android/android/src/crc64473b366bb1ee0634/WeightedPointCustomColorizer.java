package crc64473b366bb1ee0634;


public class WeightedPointCustomColorizer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.devexpress.dxcharts.WeightedCustomPointColorizer,
		com.devexpress.dxcharts.WeightedPointColorizer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getLegendItemProvider:()Lcom/devexpress/dxcharts/LegendItemProvider;:GetGetLegendItemProviderHandler:DevExpress.Xamarin.Android.Charts.IWeightedCustomPointColorizerInvoker, DevExpress.Maui.Android.Charts\n" +
			"n_getColor:(Lcom/devexpress/dxcharts/ColoredWeightedPointInfo;)I:GetGetColor_Lcom_devexpress_dxcharts_ColoredWeightedPointInfo_Handler:DevExpress.Xamarin.Android.Charts.IWeightedCustomPointColorizerInvoker, DevExpress.Maui.Android.Charts\n" +
			"";
		mono.android.Runtime.register ("DevExpress.Maui.Charts.Android.WeightedPointCustomColorizer, DevExpress.Maui.Charts", WeightedPointCustomColorizer.class, __md_methods);
	}


	public WeightedPointCustomColorizer ()
	{
		super ();
		if (getClass () == WeightedPointCustomColorizer.class)
			mono.android.TypeManager.Activate ("DevExpress.Maui.Charts.Android.WeightedPointCustomColorizer, DevExpress.Maui.Charts", "", this, new java.lang.Object[] {  });
	}


	public com.devexpress.dxcharts.LegendItemProvider getLegendItemProvider ()
	{
		return n_getLegendItemProvider ();
	}

	private native com.devexpress.dxcharts.LegendItemProvider n_getLegendItemProvider ();


	public int getColor (com.devexpress.dxcharts.ColoredWeightedPointInfo p0)
	{
		return n_getColor (p0);
	}

	private native int n_getColor (com.devexpress.dxcharts.ColoredWeightedPointInfo p0);

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
