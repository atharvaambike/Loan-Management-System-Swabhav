package com.lendingApp.main.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.lendingApp.main.dto.LoanResponseDto;
import com.lendingApp.main.dto.LoanSchemeDto;
import com.lendingApp.main.entity.LoanScheme;
import com.lendingApp.main.exception.LoanException;
import com.lendingApp.main.repository.LoanSchemeRepository;

public class LoanSchemeServiceImpl implements LoanSchemeService{

    @Autowired
    private LoanSchemeRepository loanSchemeRepository;
    @Autowired
    ModelMapper mapper;
    @Override
    public LoanResponseDto findLoandById(Long id) {
        LoanScheme loan = loanSchemeRepository.findById(id)
        .orElseThrow(() -> new LoanException("No loan with id " + id));
        return mapper.map(loan,LoanResponseDto.class);
    }
    @Override
    public LoanResponseDto addLoanScheme(LoanSchemeDto loanSchemeDto) {
        
       LoanScheme loanScheme = mapper.map(loanSchemeDto, LoanScheme.class);
       loanScheme = loanSchemeRepository.save(loanScheme);
       return mapper.map(loanScheme,LoanResponseDto.class);
    }

}
