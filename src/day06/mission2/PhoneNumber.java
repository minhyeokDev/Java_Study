package day06.mission2;

public class PhoneNumber {

    private String value;

    public PhoneNumber(String value) {
        this.validate(value);
        this.value = value;
    }

    private void validate(String phoneNumber) {
        String input010 = "^01(?:0)(\\d{3}|\\d{4})(\\d{4})$"; // 010 시작하는지 확인 정규식
        String input11 = "^\\d{3}\\d{4}\\d{4}$"; // 11글자 확인 정규식
        if (!phoneNumber.matches(input010)) { // 010으로 시작하지 않을 경우
            if (!phoneNumber.matches(input11)) { //11글자 아닐경우
                throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
            }
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
        }
    }

    public String getPhoneNumberFormally() {
        String regEx = "(\\d{3})(\\d{3,4})(\\d{4})"; // 휴대폰 번호 포맷 정규식
        return this.value.replaceAll(regEx, "$1-$2-$3");
    }
}
