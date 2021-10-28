package com.itwillbs.trip.dto;

import com.itwillbs.trip.domain.MemberVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

    private Long mno;

    private String name;

    private String password;

    public static MemberDTO of(MemberVO memberVO) {
        MemberDTO dto = new MemberDTO();
        dto.setMno(memberVO.getMno());
        dto.setName(memberVO.getName());
        dto.setPassword(memberVO.getPassword());
        return dto;
    }

    public MemberVO toVO() {
        return MemberVO.builder()
                .mno(mno)
                .name(name)
                .password(password)
                .build();
    }

}
