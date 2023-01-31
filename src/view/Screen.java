
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Screen extends JPanel {

	public Screen() {
		initComponents();
	}

	public void initComponents() {
		this.setLayout(new BorderLayout());
		icon = new ImageIcon("introduce1.jpg");
		JPanel screen = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);

			}
		};
		acountNumberField = new JTextField();
		amountMoneyField = new JTextField();
		inforLable = new JLabel();
		inforLable.setFont(new Font("Serif", 1, 17));
		acountNumberField.setFont(new Font("Serif", 1, 17));
		// acountNumberField.setForeground(Color.BLUE);
		amountMoneyField.setFont(new Font("Serif", 1, 18));
		inforLable.setForeground(Color.BLUE);

		picture = new JLabel();
		pin = new JPasswordField(6);
		infor1 = new JTextPane();
		
	
		infor1.setOpaque(false);
		infor2 = new JTextPane();
		infor2.setOpaque(false);
		
		for (int i = 0; i < leftButtons.length; i++) {
			leftButtons[i] = new JButton();
		}

		for (int i = 0; i < rightButtons.length; i++) {
			rightButtons[i] = new JButton();
		}

		for (int i = 0; i < menu.length; i++) {
			menu[i] = new JLabel();
			menu[i].setOpaque(true);
			menu[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			menu[i].setBackground(Color.BLUE);
			menu[i].setFont(new java.awt.Font("sansserif", 1, 17));
			menu[i].setForeground(Color.WHITE);

		}
		screen.add(picture);
		screen.add(pin);
		screen.add(acountNumberField);
		screen.add(amountMoneyField);
		screen.add(inforLable);
		inforLable.setOpaque(true);
		pin.setBackground(new java.awt.Color(72, 209, 204));
		amountMoneyField.setBackground(new java.awt.Color(72, 209, 204));
		acountNumberField.setBackground(new java.awt.Color(72, 209, 204));
		pin.setHorizontalAlignment(JLabel.CENTER);
		pin.setFont(new Font("sanserif", 1, 17));
		pin.setEchoChar('*');

		// screen.setBackground(new java.awt.Color(0, 153, 153));
		screen.setBackground(Color.WHITE);
		screen.setLayout(null);
		for (int i = 0; i < menu.length; i++) {
			screen.add(menu[i]);
		}

		menu[0].setBounds(11, 44, 180, 44);
		menu[0].setText(" Rút tiền");
		menu[1].setBounds(11, 107, 180, 44);
		menu[1].setText(" Chuyển khoản");
		menu[2].setBounds(11, 170, 180, 44);
		menu[2].setText(" Thanh toán");
		menu[3].setBounds(11, 229, 180, 44);
		menu[3].setText(" Đăng ký dịch vụ");
		menu[4].setBounds(259, 44, 180, 44);
		menu[4].setText(" Đổi PIN");
		menu[5].setBounds(259, 104, 180, 44);
		menu[5].setText(" Vấn tin số dư");
		menu[6].setBounds(259, 170, 180, 44);
		menu[6].setText(" In sao kê rút gọn");
		menu[7].setBounds(259, 229, 180, 44);
		menu[7].setText(" DV Khác");
		screen.add(infor1);

		screen.add(infor2);

		infor1.setContentType("text/html");
		infor2.setContentType("text/html");
//		infor1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		infor2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		screen.setBorder(javax.swing.BorderFactory.createMatteBorder(18, 6, -12, 6, new java.awt.Color(0, 0, 0)));
		screen.setPreferredSize(new Dimension(450, 100));
		this.add(screen, BorderLayout.CENTER);

		JPanel leftButtonsPanel = new JPanel();
		javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(leftButtonsPanel);
		leftButtonsPanel.setLayout(leftLayout);
		leftLayout.setHorizontalGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(leftLayout.createSequentialGroup().addGap(14, 14, 14).addGroup(leftLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(leftButtons[0], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(leftButtons[1], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(leftButtons[2], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(leftLayout.createSequentialGroup().addComponent(leftButtons[3],
								javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(0, Short.MAX_VALUE)));
		leftLayout
				.setVerticalGroup(
						leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(leftLayout.createSequentialGroup().addContainerGap().addGap(40, 40, 40)
										.addComponent(leftButtons[0], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(leftButtons[1], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(leftButtons[2], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(leftButtons[3], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(21, Short.MAX_VALUE)));
		this.add(leftButtonsPanel, BorderLayout.WEST);

		JPanel rightButtonsPanel = new JPanel();
		javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(rightButtonsPanel);
		rightButtonsPanel.setLayout(rightLayout);
		rightLayout.setHorizontalGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(rightLayout.createSequentialGroup().addGap(12, 12, 12).addGroup(rightLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(rightButtons[0], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rightButtons[1], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rightButtons[2], javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(rightLayout.createSequentialGroup().addComponent(rightButtons[3],
								javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(0, Short.MAX_VALUE)));
		rightLayout
				.setVerticalGroup(
						rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(rightLayout.createSequentialGroup().addContainerGap().addGap(43, 43, 43)
										.addComponent(rightButtons[0], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(rightButtons[1], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(rightButtons[2], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(rightButtons[3], javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(21, Short.MAX_VALUE)));
		this.add(rightButtonsPanel, BorderLayout.EAST);
		clearScreen();

	}

	public void cardInvalid() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Thẻ không hợp lệ"
				+ "<br>Card invalid</font></center></b>");
	}
	
	public void moneyInvalid() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Số tiền muốn rút không hợp lệ"
				+ "<br>Card invalid</font></center></b>");
	}
	
	public void amountMoneyInvalid() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Số tiền không hợp lệ"
				+ "<br>Card invalid</font></center></b>");
	}

	public void lenghtOfAcountWrong() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Số tài khoản phải đủ 15 số"
				+ "<br>Card invalid</font></center></b>");
	}

	public void waitDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Đang thực hiện giao dịch..."
				+ "<br>Xin vui lòng chờ</font></center></b>");
	}

	public void lockDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Tài khoản của Quý khách đã bị khóa"
				+ "<br>Xin vui lòng liên hệ ngân hàng hoặc số 19007329</font></center></b>");
	}

	public void wrongPinDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=5 color=blue>Mã Pin sai, Vui lòng nhập lại"
				+ "<br><font color=red>(Nhập sai 3 lần tài khoản của quý khác sẽ bị khóa)</font></font></center></b>");
	}

	public void wrongLenghtPinDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Mã Pin phải đủ 6 số, Vui lòng nhập lại</font></font></center></b>");
	}

	public void waitForTakeBillDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Quý khách vui lòng nhận hóa đơn</font></font></center></b>");
	}

	public void ejectCarddisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><br><b><center><font size=4 color=blue>XIN QUÝ KHÁCH NHẬN LẠI THẺ."
				+ "<br>ĐỂ ĐẢM BẢO AN TOÀN, THẺ CỦA QUÝ KHÁCH "
				+ "<br>SẼ ĐƯỢC RUNG LÊN KHI GIAO DỊCH.</font></center></b>");
	}

	public void thankdisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText("<br><br><br><br><b><center><font size=5 color=blue>NLU chân thành cảm ơn Quý khách"
				+ "<br>đã sử dụng dịch vụ</font></center></b>");
	}

	public void changePinSuccessDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><br><b><center><font size=5 color=blue>Bạn đã đổi PIN thành công</font></center></b>");
	}
	
	public void transferMoneySuccessDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><br><b><center><font size=5 color=blue>Giao dịch chuyển tiền thành công</font></center></b>");
	}
	
	public void transferMoneyNotSuccessDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Giao dịch chuyển tiền không thành công"
				+ "<br><font size=5 color=red>(Vui lòng kiểm tra lại số tài khoản nhận tiền và số dư tài khoản còn lại ít nhất 50,000 VND)</font></font></center></b>");
	}

	public void wrongConformPinDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><br><b><center><font size=5 color=blue>Nhập lại mã pin sai, vui lòng nhập lại</font></center></b>");
	}

	public void languageDisplay(String name) {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" VIỆT NAM");
		menu[7].setVisible(true);
		menu[7].setText(" ENGLISH");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<br><b><center><font size=4 color=blue>XIN CHÀO QUÝ KHÁCH: " + name
				+ "<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;WELCOME: " + name + "</font></center></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 168, 255, 122);
		infor2.setText("<br><b><center><font size=3 color=blue>VUI LÒNG LỰA CHỌN NGÔN NGỮ:"
				+ "<br>PLEASE SELECT YOUR LANGUAGE:</font></center></b>");

	}

	public void continueDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" CÓ");
		menu[7].setVisible(true);
		menu[7].setText(" KHÔNG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText(
				"<br><br><b><center><font size=5 color=blue>Quý khách có tiếp tục thực hiện giao dịch khác?</font></center></b>");

	}
	
	public void takeBillOrNotDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" CÓ");
		menu[7].setVisible(true);
		menu[7].setText(" KHÔNG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText(
				"<br><br><b><center><font size=5 color=blue>Quý khách có lấy hóa đơn không?</font></center></b>");

	}
	
	public void takeCardBeforeCashDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><b><center><font size=5 color=blue>Quý khách vui lòng nhận THẺ trước,"
				+ "<br>sau đó nhận TIỀN."
				+ "<br><br><font size=4 color=blue>ĐỂ ĐẢM BẢO AN TOÀN,"
				+ "<br>THẺ CỦA QUÝ KHÁCH SẼ ĐƯỢC RUNG LÊN"
				+ "<br>KHI GIAO DỊCH</font></font></center></b>");

	}
	
	public void reciveMoneyDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 300);
		infor1.setText(
				"<br><br><br><br><br><b><center><font size=5 color=blue>Quý khách vui lòng nhận tiền</center></b>");

	}

	public void NoteDisplay() {
		clearScreen();
		picture.setVisible(true);
		icon = new ImageIcon("background.png");
		menu[7].setVisible(true);
		menu[7].setText(" TIẾP TỤC");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 135);
		infor1.setText("<b>&nbsp;&emsp;<font size=4 color=blue>TRƯỚC KHI THỰC HIỆN GIAO DỊCH, QUÝ KHÁCH NÊN:"
				+ "<br><font>&nbsp;&emsp;- Quan sát kỹ máy atm để phát hiện việc máy bị gắn thiết bị đánh"
				+ "<br>&nbsp;&emsp;cấp dữ liệu. Đặc biệt chú ý tới một số đặc điểm sau (hình dưới):"
				+ "<br>&emsp;&nbsp;1. Bàn phím ATM;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;2. Đầu đọc thẻ;"
				+ "<br>&emsp;&nbsp;3. Vị trí camera đẻ lấy cấp số PIN;&emsp;&emsp;&emsp;4. Vỏ máy ATM;"
				+ "<br>&emsp;&nbsp;-Không thực hiện giao dịch nếu phát hiện dấu hiệu bất thường."
				+ "<br>&emsp;&nbsp;-Gọi số 19004297 để kiểm tra và sử lý</font></font></b>");
		picture.setBounds(45, 155, 184, 130);
		picture.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		picture.setIcon(new ImageIcon("note1.png"));

	}

	public void pinDisplay() {
		clearScreen();
		pin.setVisible(true);
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 60);
		infor1.setText("<br><b><center><font size=4 color=blue>QUÝ KHÁCH HÃY NHẬP SỐ PIN SAU ĐÓ ẤN ENTER"
				+ "<br>(Quý khách lưu ý dùng tay che bàn phím, tránh bị lộ mã PIN)</font></center></b>");
		pin.setBounds(167, 88, 120, 35);
		picture.setVisible(true);
		picture.setBounds(160, 146, 130, 83);
		picture.setIcon(new ImageIcon("chetay.jpg"));
		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText(
				"<b><center><font size=5 color=blue>Chọn <font color=red>CANCEL</font> để thoát</font></center></b>");
	}

	public void changePinStep1Display() {
		clearScreen();
		pin.setVisible(true);
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<b><center><font size=5 color=blue>Để bảo mật thông tin và bảo đảm an toàn giao dịch,"
				+ "<br>Quý khách vui lòng thay đổi mã PIN theo hướng dẫn." + "<br>Quý khách nhập mã PIN mới tại đây"
				+ "<br>(Độ dài của PIN là 6 số)</font></center></b>");
		pin.setBounds(167, 120, 120, 35);

		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText(
				"<b><center><font size=4 color=blue>(Quý khách chọn Enter để tiếp tục, Canel để thoát)</font></center></b>");
	}

	public void changePinStep2Display() {
		clearScreen();
		pin.setVisible(true);
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 70);
		infor1.setText(
				"<br><br><b><center><font size=5 color=blue>Quý khách vui lòng nhập PIN một lần nữa</font></center></b>");
		pin.setBounds(167, 100, 120, 35);

		infor2.setVisible(true);
		infor2.setBounds(5, 230, 440, 50);
		infor2.setText(
				"<b><center><font size=4 color=blue>(Ấn Clear để nhập lại hoặc Canel để thoát)</font></center></b>");
	}

	public void feeDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 230);
		infor1.setText("<b><center><font size=5 color=blue>NLU xin thông báo Quý khách"
				+ "<br>về mức phí giao dịch thực hiện trên ATM như sau:" + "<table border=1 color=blue"
				+ "><tr><td>Phí rút tiền mặt</td><td>1.000 VND/giao dịch</td></tr>"
				+ "<tr><td>Phí chuyển khoản trong cùng hệ thống NLU</td><td>3.000 VND/giao dịch cùng hệ thống<br>5.000 VND/giao dịch khác hệ thống</td></tr>"
				+ "<tr><td>Phí in hóa đơn</td><td>500 VND/giao dịch</td></tr>"
				+ "<tr><td>Phí yêu cầu in sao kê tài khoản</td><td>5.000 VND/lần</td></tr></table></font></center></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 247, 440, 50);
		infor2.setText("<b><center><font size=4 color=blue>Quý khách chọn <font color=red>ENTER</font> để tiếp tục"
				+ "<br>chọn <font color=red>CANCEL</font> để thoát</font></center></b>");
	}

	public void introducedisplay() {
		clearScreen();

		icon = new ImageIcon("introduce1.jpg");
	}

	public void menuDisplay() {
		icon = new ImageIcon("background.png");
		clearScreen();
		for (int i = 0; i < menu.length; i++) {
			menu[i].setVisible(true);
		}

		menu[0].setText(" Rút tiền");

		menu[1].setText(" Chuyển khoản");

		menu[2].setText(" Thanh toán");

		menu[3].setText(" Đăng ký dịch vụ");

		menu[4].setText(" Đổi PIN");

		menu[5].setText(" Vấn tin số dư");

		menu[6].setText(" In sao kê rút gọn");

		menu[7].setText(" DV Khác");

	}

	public void banlanceInquiryDisplay(int balance) {
		clearScreen();
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String num = en.format(balance);
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" CÓ");
		menu[7].setVisible(true);
		menu[7].setText(" KHÔNG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 150);
		infor1.setText(
				"<br><b><font size=4 color=blue><font size=5 color=blue><center>GIAO DICH VẤN TIN SỐ DƯ</center></font>"
						+ "<br>&nbsp;SỐ DƯ TÀI KHOẢN HIỆN TẠI CỦA QUÝ KHÁCH: " + num + " VND"
						+ "<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;PHÍ GIAO DỊCH: 0.00 VND"
						+ "<br><center>&nbsp;&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;VAT: 0.00 VND</center></font></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 168, 255, 122);
		infor2.setText(
				"<br><b><center><font size=4 color=blue><br>Quý khách có muốn in hóa đơn không?</font></center></b>");

	}
	
	public void conformWithdrawDisplay(int balance) {
		clearScreen();
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String num = en.format(balance);
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" CÓ");
		menu[7].setVisible(true);
		menu[7].setText(" KHÔNG");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 150);
		infor1.setText(
				"<br><b><font size=4 color=blue><font size=5 color=blue><center>Giao dịch rút tiền của quý khách thành công.</center></font>"
						+ "<br>&nbsp;SỐ DƯ TÀI KHOẢN HIỆN TẠI CỦA QUÝ KHÁCH: " + num + " VND"
						+ "<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;PHÍ GIAO DỊCH: 1.000 VND"
						+ "<br><center>&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;VAT: 100 VND</center></font></b>");
		infor2.setVisible(true);
		infor2.setBounds(5, 168, 255, 122);
		infor2.setText(
				"<br><b><center><font size=4 color=blue><br>Quý khách có muốn in hóa đơn không?</font></center></b>");

	}

	public void tranferMoneyStep1Display() {
		clearScreen();
		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 60);
		infor1.setText(
				"<br><b><center><font size=5 color=blue>Quý khách vui lòng nhập tài khoản nhân tiền</font></center></b>");
		acountNumberField.setVisible(true);
		acountNumberField.setBounds(210, 95, 170, 35);
		inforLable.setVisible(true);
		inforLable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inforLable.setBounds(60, 95, 153, 35);
		inforLable.setText("Tài khoản nhận tiền:");
		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText(
				"<b><center><font size=4 color=blue>(Chọn ENTER để đồng ý, CANCEL để thoát)</font></center></b>");
	}

	public void tranferMoneyStep2Display() {
		clearScreen();

		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<br><b><center><font size=5 color=blue>Quý khách vui lòng nhập số tiền muốn chuyển"
				+ "<br><br>Tài khoản nhận tiền: " + acountNumberField.getText() + "</font></center></b>");
		amountMoneyField.setVisible(true);
		amountMoneyField.setBounds(238, 120, 170, 35);
		inforLable.setVisible(true);
		inforLable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		inforLable.setBounds(88, 120, 150, 35);
		inforLable.setText("                      Số tiền:");
		infor2.setVisible(true);
		infor2.setBounds(5, 250, 440, 50);
		infor2.setText("<b><center><font size=4 color=blue>(Ấn CANCEL để thoát)</font></center></b>");
	}
	
	public void enterMoneyDisplay() {
		clearScreen();

		icon = new ImageIcon("background.png");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 100);
		infor1.setText("<br><b><center><font size=5 color=blue>ATM chỉ trả được số tiền là bội số của"
				+ "<br>100000"
				+ "<br>Quý khách vui lòng nhập số tiền muốn rút</font></center></b>");
		amountMoneyField.setVisible(true);
		amountMoneyField.setHorizontalAlignment(JLabel.CENTER);
		amountMoneyField.setBounds(143, 120, 170, 35);
		infor2.setVisible(true);
		infor2.setBounds(5, 237, 440, 50);
		infor2.setText("<b><center><font size=5 color=blue>(Số tiền nhập vào phải là VND)"
				+ "<br>(Ấn CANCEL để thoát)</font></center></b>");
	}

	public void tranferMoneyStep3Display(String name) {
		clearScreen();
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		int balance = Integer.parseInt(amountMoneyField.getText().replace(",", ""));
		String num = en.format(balance);
		icon = new ImageIcon("background.png");
		menu[6].setVisible(true);
		menu[6].setText(" Tiếp tục");
		menu[7].setVisible(true);
		menu[7].setText(" Thoát");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 150);
		infor1.setText("<br><b><font size=5 color=blue><center>Xin vui lòng kiểm tra lại để chuyển khoản</center>"
				+ "<br>&emsp;TK chuyển đến: &emsp;&nbsp;&nbsp;&nbsp;" + acountNumberField.getText() + ""
				+ "<br>&emsp;Khách hàng: &emsp;&emsp;&emsp;" + name + ""
				+ "<br>&emsp;Số tiền: &emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;" + num + " VND</font></b>");
		

	}

	public void clearDataInfor() {
		acountNumberField.setText("");
		amountMoneyField.setText("");
		pin.setText("");
	}

	public void clearScreen() {
		acountNumberField.setVisible(false);
		amountMoneyField.setVisible(false);
		inforLable.setVisible(false);
		picture.setVisible(false);
		pin.setVisible(false);
		pin.setText("");
		// icon = new ImageIcon("introduce1.jpg");
		infor1.setVisible(false);
		infor2.setVisible(false);
		for (int i = 0; i < menu.length; i++) {
			menu[i].setVisible(false);
		}
	}
	
	public void chooseMoneyDisplay() {
		clearScreen();
		icon = new ImageIcon("background.png");
		menu[0].setVisible(true);
		menu[0].setText(" 100 000");
		menu[1].setVisible(true);
		menu[1].setText(" 500 000");
		menu[2].setVisible(true);
		menu[2].setText(" 1 000 000");
		menu[3].setVisible(true);
		menu[3].setText(" 1 500 000");
		menu[4].setVisible(true);
		menu[4].setText(" 2 000 00");
		menu[6].setVisible(true);
		menu[6].setText(" Số khác");
		menu[7].setVisible(true);
		menu[7].setText(" Trả thẻ");
		infor1.setVisible(true);
		infor1.setBounds(5, 17, 440, 29);
		infor1.setText(
				"<b><center><font size=5 color=blue>Xin vui lòng lựa chọn số tiền</font></center></b>");

	}

	public JButton getLeftButton1() {
		return leftButtons[0];
	}

	public JButton getLeftButton2() {
		return leftButtons[1];
	}

	public JButton getLeftButton3() {
		return leftButtons[2];
	}

	public JButton getLeftButton4() {
		return leftButtons[3];
	}

	public JButton getRightButton1() {
		return rightButtons[0];
	}

	public JButton getRightButton2() {
		return rightButtons[1];
	}

	public JButton getRightButton3() {
		return rightButtons[2];
	}

	public JButton getRightButton4() {
		return rightButtons[3];
	}

	public void setPin(String num) {
		if (pin.getText().length() < 6) {
			pin.setText(num);
		}

	}

	public String getPin() {
		return pin.getText();
	}

	public String getAcountNumberToTranfer() {
		return acountNumberField.getText();
	}

	public void setAcountNumberToTranfer(String num) {
		if (acountNumberField.getText().length() < 15) {
			acountNumberField.setText(num);
		}
	}

	public String getAmountMoneyToTranfer() {
		return amountMoneyField.getText();
	}

	public void setAmountMoneyToTranfer(String num) {
		int amount = Integer.parseInt(num.replaceAll(",", ""));
		if (amount > 50000000) {
			amountMoneyField.setText("50,000,000");
		}
		if (!getAmountMoneyToTranfer().equals("50,000,000")) {
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);
			String n = en.format(amount);
			amountMoneyField.setText(n);
		}	

	}
	
	public void setAmountMoneyToWithdraw(String num) {
		int amount = Integer.parseInt(num.replaceAll(",", ""));
		if (amount > 5000000) {
			amountMoneyField.setText("5,000,000");
		}
		if (!getAmountMoneyToTranfer().equals("5,000,000")) {
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);
			String n = en.format(amount);
			amountMoneyField.setText(n);
		}	

	}
	
	public void clearAmountMoney() {
		amountMoneyField.setText("");
	}

	private JTextField acountNumberField, amountMoneyField;
	private JLabel inforLable;
	private JPasswordField pin;
	static ImageIcon icon;
	private JLabel picture;
	private JLabel[] menu = new JLabel[8];
	private JTextPane infor1, infor2;
	private JButton[] leftButtons = new JButton[4];
	private JButton[] rightButtons = new JButton[4];

}
