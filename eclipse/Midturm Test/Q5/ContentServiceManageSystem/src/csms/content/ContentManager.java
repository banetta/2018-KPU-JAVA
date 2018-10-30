package csms.content;

import csms.show.Showable;

public class ContentManager implements Showable{
	
	private Content carr[];
	private int index=0;
	
	public ContentManager(int n) {
		carr = new Content[n];
	}
	
	public void addContent(Content cont) {
		carr[index++] = cont;
	}
	
	public void showAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(carr[i].toString());
		}
	}
	
	public void setDefault() {
		carr[index++] = new Movie(index, "����� ��ȭ", "�罺����", 1000);
		carr[index++] = new Movie(index, "���� �ܿ�", "�ڿϼ�", 1100);
		carr[index++] = new Drama(index, "�̽��� ������ 1ȭ", "tvN", 1200);
		carr[index++] = new Drama(index, "�̽��� ������ 2ȭ", "tvN", 1300);
		carr[index++] = new Drama(index, "�̽��� ������ 3ȭ", "tvN", 1500);
		carr[index++] = new Show(index, "�ѳ��ݼ� 100ȸ", "jtbc", 900);
		carr[index++] = new Show(index, "�ɾ ����� 10ȸ", "MDC", 2000);
	}
	
	public Content findContentByTitle(String content) {
		for (int i = 0; i < index; i++) {
			if (carr[i].getTitle().equals(content)) {
				return carr[i];
			}
		}
		return null;
	}

}
