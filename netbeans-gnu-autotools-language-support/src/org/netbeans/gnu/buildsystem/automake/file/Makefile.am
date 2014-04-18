bin_PROGRAMS = programname
programname_SOURCES  = program.h program.c

if USE_CORESERVICES
  programname_LDFLAGS = -framework CoreServices
endif

man_MANS = programname.7
EXTRA_DIST = $(man_MANS)
dist_doc_DATA  = README.yours README.md
