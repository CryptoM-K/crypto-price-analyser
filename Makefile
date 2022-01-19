install-java:
	echo


.ONESHELL:

install-extra-tools: install-dive

install-dive:
	export DIVE_VERSION=0.10.0

	if command -v dive; then return 0; fi
	wget -nc -q https://github.com/wagoodman/dive/releases/download/v$${DIVE_VERSION}_dive_$${DIVE_VERSION}_linux_amd64.tar.gz
	mkdir dive
	tar zxvf dive_$${DIVE_VERSION}_linux_amd64.tar.gz --directory=dive
	chmod +x dive/dive
	sudo mv dive/dive /usr/local/bin/dive
	rm -rf dive
	rm dive_$${DIVE_VERSION}_linux_amd64.tar.gz

install-dockle:
	export DOCKLE_VERSION=0.4.3

	if command -v dockle; then return 0; fi
	wget -nc -q https://github.com/goodwithtech/dockle/releases/download/v$${DOCKLE_VERSION}_/dockle_$${DOCKLE_VERSION}_Linux-64bit.tar.gz
	mkdir dockle
	tar zxvf dockle_$${DOCKLE_VERSION}_Linux-64bit.tar.gz --directory=dockle
	chmod +x dockle/dockle
	sudo mv dockle/dockle /usr/local/bin/dockle
	rm -rf dockle
	rm dockle_$${DOCKLE_VERSION}_linux_amd64.tar.gz

test-dive:
	dive --ci --config=cicd/dive-config.yaml hello-world:latest

test-dockle:
	dockle --exit-code 1 --exit-level fatal hello-world:latest