package pro;

public class MemberBusinessImpl implements MemberBusiness {
	Member members[];
	int maxCnt = 0;

	public MemberBusinessImpl() {
		members = new Member[20];
		members[0] = new Member(findMaxId(), "张三");
		members[1] = new Member(findMaxId(), "唐竟翔");

	}

	public String findMaxId() {
		maxCnt++;
		StringBuffer strBuf = new StringBuffer("A");
		if (maxCnt < 10) {
			strBuf.append("000");
		} else if (maxCnt >= 10 && maxCnt < 100) {
			strBuf.append("00");
		} else if (maxCnt >= 100 && maxCnt < 1000) {
			strBuf.append("0");
		}
		strBuf.append(maxCnt);
		return strBuf.toString();

	}

	public static void main(String[] args) {
		MemberBusinessImpl mi = new MemberBusinessImpl();
		System.out.println(mi.maxCnt);
		for (int i = 0; i < 100; i++) {
			System.out.println(mi.findMaxId());
		}

	}

	@Override
	public void addMember(Member member) {
		for(int i=0;i<this.members.length;i++){
			if(null==members[i]){
				members[i]=member;
				break;
			}
		}
	}

	@Override
	public void editMember(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void queryAllMember() {
		System.out.println("ID\t姓名\t性别\t生日\t手机号\t地址ַ\tְ职业\t积分");
		for(Member mem:this.members){
			if(mem!=null){
				System.out.print(mem.getId()+"\t");
				System.out.print(mem.getName()+"\t");
				System.out.print(mem.getGender()+"\t");
				System.out.print(mem.getDateStr()+"\t");
				System.out.print(mem.getPhoneNumber()+"\t");
				System.out.print(mem.getAddress()+"\t");
				System.out.print(mem.getJob()+"\t");
				System.out.print(mem.getPoint());
				System.out.println();
			}
			
			
		}
	}

	@Override
	public Member queryMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
