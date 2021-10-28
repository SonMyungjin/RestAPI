package com.itwillbs.trip.controller;

import com.itwillbs.trip.dto.MemberDTO;
import com.itwillbs.trip.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController { // http://localhost:8181/members

    private final MemberService memberService;

    // POST, GET, PUT (PATCH), DELETE
    @PostMapping // POST http://localhost:8181/members -> CREATE
    public String register(@RequestBody MemberDTO memberDTO) { // HTTP Body 정보를 매핑
        memberService.register(memberDTO);
        return "멤버 추가 성공";
    }

    @GetMapping("/{mno}") // POST http://localhost:8181/members/1 -> READ
    public MemberDTO getMember(@PathVariable Long mno) {
        return memberService.getMember(mno);
    }

    @PutMapping("/{mno}") // PUT http://localhost:8181/members/1 -> UPDATE
    public String update(@PathVariable Long mno, @RequestBody MemberDTO memberDTO) {
        memberService.update(mno, memberDTO);
        return "멤버 수정 성공";
    }

    @DeleteMapping("/{mno}") // DELETE http://localhost:8181/members/1 -> DELETE
    public String delete(@PathVariable Long mno) {
        memberService.delete(mno);
        return "멤버 삭제 성공";
    }

}
