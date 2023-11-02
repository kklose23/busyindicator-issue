namespace MonkeyFinder.View;

public partial class MainPage : ContentPage
{
  public MainPage(MonkeysViewModel viewModel)
  {
    InitializeComponent();
    BindingContext = viewModel;
  }

  private void Button_Clicked(object sender, EventArgs e)
  {
    busyIndicator.IsBusy = true;
    grid.HeightRequest = 500;
    busyIndicator.IsBusy = false;
  }
}

