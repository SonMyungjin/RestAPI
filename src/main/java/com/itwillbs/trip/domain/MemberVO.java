package com.itwillbs.trip.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class MemberVO {

    private Long mno;

    private String name;

    private String password;

}
