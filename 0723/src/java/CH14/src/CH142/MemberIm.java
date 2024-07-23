package CH142;

public class MemberIm implements MemberMobile,MemberPC{

	@Override
	public void joinMember() {
		System.out.println("PC에서 회원가입합니다");
	}

	@Override
	public void SerchMember() {
		System.out.println("PC에서 회원조회합니다");
	}

	@Override
	public void ModMember() {
		System.out.println("PC에서 회원수정합니다");
	}

	@Override
	public void delMember() {
		System.out.println("PC에서 회원삭제합니다");
	}

	@Override
	public void joinMemberMobile() {
		System.out.println("모바일에서 회원가입합니다");
	}

	@Override
	public void SerchMemberMobile() {
		System.out.println("모바일에서 회원조회합니다");
	}

	@Override
	public void ModMemberMobile() {
		System.out.println("모바일에서 회원수정합니다");
	}

	@Override
	public void delMemberMobile() {
		System.out.println("모바일에서 회원삭제합니다");
	}

}
