package crc64434fcf5c13957fe7;


public class ScrolledListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.primitives.panels.ScrollViewScrollChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrollChange:(Landroid/view/View;IIII)V:GetOnScrollChange_Landroid_view_View_IIIIHandler:Com.Telerik.Widget.Primitives.Panels.IScrollViewScrollChangedListenerInvoker, Telerik.Android.Primitives\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.ScrollView.ScrolledListener, Telerik.Maui.Core", ScrolledListener.class, __md_methods);
	}


	public ScrolledListener ()
	{
		super ();
		if (getClass () == ScrolledListener.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.ScrollView.ScrolledListener, Telerik.Maui.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void onScrollChange (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_onScrollChange (p0, p1, p2, p3, p4);
	}

	private native void n_onScrollChange (android.view.View p0, int p1, int p2, int p3, int p4);

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
