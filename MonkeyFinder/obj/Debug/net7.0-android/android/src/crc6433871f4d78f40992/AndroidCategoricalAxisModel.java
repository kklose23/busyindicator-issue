package crc6433871f4d78f40992;


public class AndroidCategoricalAxisModel
	extends com.telerik.widget.chart.engine.axes.categorical.CategoricalAxisModel
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getLabelContentCore:(Lcom/telerik/widget/chart/engine/axes/AxisTickModel;)Ljava/lang/Object;:GetGetLabelContentCore_Lcom_telerik_widget_chart_engine_axes_AxisTickModel_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.Compatibility.ChartRenderer.Android.AndroidCategoricalAxisModel, Telerik.Maui.Controls.Compatibility", AndroidCategoricalAxisModel.class, __md_methods);
	}


	public AndroidCategoricalAxisModel ()
	{
		super ();
		if (getClass () == AndroidCategoricalAxisModel.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Compatibility.ChartRenderer.Android.AndroidCategoricalAxisModel, Telerik.Maui.Controls.Compatibility", "", this, new java.lang.Object[] {  });
		}
	}


	public java.lang.Object getLabelContentCore (com.telerik.widget.chart.engine.axes.AxisTickModel p0)
	{
		return n_getLabelContentCore (p0);
	}

	private native java.lang.Object n_getLabelContentCore (com.telerik.widget.chart.engine.axes.AxisTickModel p0);

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
