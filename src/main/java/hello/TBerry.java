package hello;

public class TBerry {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HelloDTO dto = new HelloDTO();
		dto.setName("berry1255");
		dto.setOccuption("enginner");
		
		WelcomeDto wDto = new WelcomeDto();
		wDto.setQuestion("q1");
		wDto.setSpeak("spk1");
		
		
		ITOkImpl<HelloDTO> helloDao = new ITOkImpl<>();
		ITOkImpl<WelcomeDto> welcomeDao = new ITOkImpl<>();
		TBerry serviceHello = new TBerry();
		helloDao.pr(dto);
		welcomeDao.pr(wDto);
		//System.out.println(TBerry.class.getName());
	}
}
