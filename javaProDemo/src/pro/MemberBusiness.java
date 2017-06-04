package pro;

/**
 * 会员维护接口
 * */
public interface MemberBusiness {
	
	/**
	 * 新增会员
	 * */
	public void addMember(Member member);
	
	/**
	 * 修改会员 
	 * */
	public void editMember(Member member);
	
	/**
	 * 删除会员
	 * */
	public void deleteMember(String id);
	
	/**
	 * 查询所有会员
	 * */
	public void queryAllMember();
	
	/**
	 * 根据ID来查询会员
	 * */
	public Member queryMemberById(String id);
	
	/**
	 * 生成会员ID
	 * */
	public String findMaxId();
}
