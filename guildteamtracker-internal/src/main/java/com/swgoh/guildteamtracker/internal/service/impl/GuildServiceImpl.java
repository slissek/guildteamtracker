package com.swgoh.guildteamtracker.internal.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;
import com.swgoh.guildteamtracker.internal.entities.dao.guild.GuildInfoDAO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.mapper.dao.guild.GuildInfoDAOToGuildInfoMapper;
import com.swgoh.guildteamtracker.internal.mapper.dto.guild.GuildInfoToGuildInfoDTOMapper;
import com.swgoh.guildteamtracker.internal.repository.GuildInfoRepository;
import com.swgoh.guildteamtracker.internal.service.GuildService;

@ApplicationScoped
public class GuildServiceImpl implements GuildService {

    @Inject
    private GuildInfoRepository guildInfoRepository;

    @Inject
    private GuildInfoDAOToGuildInfoMapper guildInfoMapper;

    @Inject
    private GuildInfoToGuildInfoDTOMapper guildInfoDTOMapper;

    @Override
    public List<GuildDTO> getGuilds() {
        final List<GuildInfoDAO> guildInfosDAO = guildInfoRepository.listAll();
        final List<GuildInfo> guildInfos = guildInfosDAO.stream().map(gIDAO -> guildInfoMapper.toResource(gIDAO)).collect(Collectors.toList());
        return guildInfos.stream().map(gI -> guildInfoDTOMapper.toResource(gI)).collect(Collectors.toList());
    }

    @Override
    public GuildInfoDTO getGuildInfoById(String id) {
        final Optional<GuildInfoDAO> guildInfoOptional = guildInfoRepository.findByIdOptional(id);

        if (guildInfoOptional.isPresent()) {
            final GuildInfoDAO guildInfoDAO = guildInfoOptional.get();
            final GuildInfo guildInfo = guildInfoMapper.toResource(guildInfoDAO);
            return guildInfoDTOMapper.toResource(guildInfo);
        }
        return null;
    }

    @Override
    public GuildInfoDTO getGuildInfoByName(String name) {
        final List<GuildInfoDAO> guildInfoList = guildInfoRepository.findByName(name);

        if (guildInfoList != null && guildInfoList.size() == 1) {
            final GuildInfoDAO guildInfoDAO = guildInfoList.get(0);
            final GuildInfo guildInfo = guildInfoMapper.toResource(guildInfoDAO);
            return guildInfoDTOMapper.toResource(guildInfo);
        }
        return null;
    }

}
