package mono.com.telerik.android.primitives.widget.slideview;


public class SlideViewChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.android.primitives.widget.slideview.SlideViewChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChangingCurrentView:(Landroid/view/View;)Z:GetOnChangingCurrentView_Landroid_view_View_Handler:Com.Telerik.Android.Primitives.Widget.Slideview.ISlideViewChangeListenerInvoker, Telerik.Android.Primitives\n" +
			"n_onCurrentViewChanged:(Landroid/view/View;Landroid/view/View;)V:GetOnCurrentViewChanged_Landroid_view_View_Landroid_view_View_Handler:Com.Telerik.Android.Primitives.Widget.Slideview.ISlideViewChangeListenerInvoker, Telerik.Android.Primitives\n" +
			"";
		mono.android.Runtime.register ("Com.Telerik.Android.Primitives.Widget.Slideview.ISlideViewChangeListenerImplementor, Telerik.Android.Primitives", SlideViewChangeListenerImplementor.class, __md_methods);
	}


	public SlideViewChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SlideViewChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Telerik.Android.Primitives.Widget.Slideview.ISlideViewChangeListenerImplementor, Telerik.Android.Primitives", "", this, new java.lang.Object[] {  });
		}
	}


	public boolean onChangingCurrentView (android.view.View p0)
	{
		return n_onChangingCurrentView (p0);
	}

	private native boolean n_onChangingCurrentView (android.view.View p0);


	public void onCurrentViewChanged (android.view.View p0, android.view.View p1)
	{
		n_onCurrentViewChanged (p0, p1);
	}

	private native void n_onCurrentViewChanged (android.view.View p0, android.view.View p1);

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
