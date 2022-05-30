import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
public class UIHelp extends generalPanel{
	private JPanel pane;
	private JLabel bg, help;
	protected int num=0, panelNum;
	protected JButton next, back, cancel;

	UIHelp(JPanel pane, int panelNum){
		this.pane=pane;
		pane.setOpaque(true);
		num=1;
		this.panelNum=panelNum;
		back=addButton(pane, "img/help/left.png", "img/help/h_left.png",255,485);
		next=addButton(pane, "img/help/right.png", "img/help/h_right.png",480,485);
		cancel=addButton(pane, "img/exit/cancel.png", "img/exit/h_cancel.png",337,485); //image not functional
		help=addLabel(pane,"img/help/1.png",45,0);
		bg=addLabel(pane,"img/bg/help.png",45,0);
		pane.setVisible(true);
		}
	protected void increase(){
		num++;
		if(num==5)
			num=1;
		changePicture(help, "img/help/"+num+".png");
		}
	protected void decrease(){
		num--;
		if(num==0)
			num=4;
		changePicture(help, "img/help/"+num+".png");
		}
	protected void decompose(){
		pane.removeAll();
		pane.setVisible(false);
		back=cancel=next=null;
		bg=help=null;
		}
	}
