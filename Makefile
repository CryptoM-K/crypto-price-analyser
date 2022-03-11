test-dive:
	dive --ci --config=cicd/dive-config.yaml hello-world:latest

test-dockle:
	dockle --exit-code 1 --exit-level fatal hello-world:latest

test-trivy:
	trivy image golang:1.16

install-all:
	$(MAKE) -C cicd -f Makefile.install install-extra-tools

install-ci-tools:
	$(MAKE) -C cicd -f Makefile.install \
	install-dive \
	install-dockle \
	install-trivy \
	install-docker-slim

create-environment:
	$(MAKE) -C cicd -f Makefile.k3d create