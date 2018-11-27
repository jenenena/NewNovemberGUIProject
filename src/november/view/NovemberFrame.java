package november.view;

import javax.swing.JFrame;
import november.controller.NovemberController;

public class NovemberFrame extends JFrame
{
	private NovemberController appController;
	private NovemberPanel appPanel;
	
	public NovemberFrame(NovemberController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new NovemberPanel(appController);
		
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);;
		this.setTitle("November GUI App");
		this.setResizable(false);;
		this.setVisible(true);
	}

}
